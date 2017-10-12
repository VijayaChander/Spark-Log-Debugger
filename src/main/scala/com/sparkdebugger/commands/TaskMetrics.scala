package com.sparkdebugger.commands

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SQLContext
import org.apache.log4j.Logger
import org.apache.spark.sql.functions._
import jline.console.ConsoleReader
import com.sparkdebugger.util.SparkUtil
import com.sparkdebugger.util.SparkConstants

object TaskMetrics extends ICommand{

	    val sc = SparkUtil().sparkContext
			val sqlContext = new org.apache.spark.sql.hive.HiveContext(sc)
			var tempArgs : String ="" 
			val LOGGER: Logger = Logger.getLogger(getClass.getName)
			val JMreader:ConsoleReader =new ConsoleReader
			val exitCommand = List("exit","quit","\u0004","q")
			var taskMap = scala.collection.mutable.Map[String,String]() 

			def execute(args:String):Unit={ 
					try{
					      //reading log file
						    val log = sc.textFile("hdfs://"+SparkConstants.HOST_PORT+SparkConstants.WORKING_DIRECTORY+tempArgs)
								
						    //filtering log file based upon certain conditions
						    val taskLog = log.filter(_.contains("SparkListenerTaskEnd"))
						    
						    //creating dataframe from the filtered log file
								val taskLogDf = sqlContext.read.json(taskLog).select("Task Info.Task ID","Task Info.Attempt","Task Info.Executor ID","Task Info.Host","Task Info.Locality","Task Info.Launch Time","Task Info.Finish Time","Task Metrics.Disk Bytes Spilled","Task Metrics.Executor Deserialize Time","Task Metrics.Executor Run Time","Task Metrics.Input Metrics.Bytes Read","Task Metrics.Input Metrics.Records Read","Task Metrics.JVM GC Time","Task Metrics.Memory Bytes Spilled","Task Metrics.Result Serialization Time","Task Metrics.Result Size","Task Metrics.Shuffle Read Metrics.Fetch Wait Time","Task Metrics.Shuffle Read Metrics.Local Blocks Fetched","Task Metrics.Shuffle Read Metrics.Local Bytes Read","Task Metrics.Shuffle Read Metrics.Remote Blocks Fetched","Task Metrics.Shuffle Read Metrics.Remote Bytes Read","Task Metrics.Shuffle Read Metrics.Total Records Read","Task Metrics.Shuffle Write Metrics.Shuffle Bytes Written","Task Metrics.Shuffle Write Metrics.Shuffle Records Written","Task Metrics.Shuffle Write Metrics.Shuffle Write Time","Task Info.Speculative","Task Type","Task End Reason.Reason")

								//adding a column with the dataframe                                                                                                           
								val taskDf = taskLogDf.withColumn("Duration(min)", round((taskLogDf("Finish Time").cast("long") - taskLogDf("Launch Time").cast("long")) / 60D /1000,2))
								val resultDf = taskDf.orderBy(asc("Task ID")).select(taskDf("Task ID"),taskDf("Attempt"),taskDf("Executor ID"),taskDf("Host"),taskDf("Locality"),from_unixtime(taskDf("Launch Time")/1000,"yyyy-MM-dd HH:mm:ss") as "Launch Time",from_unixtime(taskDf("Finish Time")/1000,"yyyy-MM-dd HH:mm:ss") as "Finish Time",taskDf("Duration(min)"),taskDf("Disk Bytes Spilled"),taskDf("Executor Deserialize Time"),taskDf("Executor Run Time"),taskDf("Bytes Read"),taskDf("Records Read"),taskDf("JVM GC Time"),taskDf("Memory Bytes Spilled"),taskDf("Result Serialization Time"),taskDf("Result Size"),taskDf("Fetch Wait Time"),taskDf("Local Blocks Fetched"),taskDf("Local Bytes Read"),taskDf("Remote Blocks Fetched"),taskDf("Remote Bytes Read"),taskDf("Total Records Read"),taskDf("Shuffle Bytes Written"),taskDf("Shuffle Records Written"),taskDf("Shuffle Write Time"),taskDf("Speculative"),taskDf("Task Type"),taskDf("Reason") as "Task Status")

								readLoop()

								def readLoop():Unit={
										println("Select a task metric listed below to view specific metrics or enter \"ALL\" to view all the task metrics :")
										println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
										var counter = 0
										val displayDf = resultDf.select("Executor ID","Host","Attempt","Locality","Launch Time","Finish Time","Duration(min)","Disk Bytes Spilled","Executor Deserialize Time","Executor Run Time","Bytes Read","Records Read","JVM GC Time","Memory Bytes Spilled","Result Serialization Time","Result Size","Fetch Wait Time","Local Blocks Fetched","Local Bytes Read","Remote Blocks Fetched","Remote Bytes Read","Total Records Read","Shuffle Bytes Written","Shuffle Records Written","Shuffle Write Time","Speculative","Task Type","Task Status")
										displayDf.columns.foreach{ x => 
										counter += 1
										taskMap.put(counter.toString(),x)
										println(counter +". " +x)
										}
										print("Enter an option or type \"q\" to quit task metrics :")
										//reading input from command line
										val command = JMreader.readLine()
										if(exitCommand.contains(command.toLowerCase()))exit()
										else{
										  //processing the command
											processCommand(command)   
											readLoop()
										}
								}

								def processCommand(c:String):Unit={
										if(c=="ALL" || c=="all")
											  resultDf.show(resultDf.count().toInt,false)
											else if(resultDf.columns.contains(taskMap(c))){
												println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
												resultDf.select(resultDf.col("Task ID"),resultDf.col(taskMap(c))).show(resultDf.count().toInt,false)
												println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
											}
											else
												println("Enter a valid Task Metric listed below..")

								}

								def exit():Unit={
										println("=================== Ending Task Metrics ===================")
										JMreader.shutdown()
										JMHelp.execute("help")
								}

					}     catch {
					case ex: Throwable =>  LOGGER.error("Spark Debugger error", ex) // TODO: handle error
					}
			}
}

