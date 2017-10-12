
package com.sparkdebugger.commands

import org.apache.log4j.Logger
import jline.console.ConsoleReader
import org.apache.spark.sql.functions._
import org.apache.spark.sql.DataFrame
import com.sparkdebugger.util.SparkUtil
import com.sparkdebugger.util.SparkConstants

object StageMetrics extends ICommand{
	    val sc = SparkUtil().sparkContext
			val sqlContext = new org.apache.spark.sql.hive.HiveContext(sc)
			var tempArgs : String ="" 
			val LOGGER: Logger = Logger.getLogger(getClass.getName)
			val reader:ConsoleReader =new ConsoleReader
			val exitCommand = List("exit","quit","\u0004","q")

			def execute(args:String):Unit={
					try{      
					      //reading log file
						    val log = sc.textFile("hdfs://"+SparkConstants.HOST_PORT+SparkConstants.WORKING_DIRECTORY+tempArgs)      
														    
						    //filtering log file based upon certain conditions
						    val stageLog = log.filter(_.contains("SparkListenerStageCompleted"))
								val metricsLog = log.filter(_.contains("SparkListenerTaskEnd"))
								
						    //creating dataframe from the filtered log file
						    val stageDf1 = sqlContext.read.json(stageLog).select("Stage Info.Stage ID","Stage Info.Stage Name","Stage Info.Stage Attempt ID","Stage Info.Number of Tasks","Stage Info.Submission Time","Stage Info.Completion Time","Stage Info.Details")
								val metricsDf = sqlContext.read.json(metricsLog).select("Stage ID","Task Metrics.JVM GC Time","Task Metrics.Shuffle Write Metrics.Shuffle Write Time","Task Metrics.Result Serialization Time","Task Metrics.Shuffle Write Metrics.Shuffle Bytes Written","Task Metrics.Result Size","Task Metrics.Shuffle Write Metrics.Shuffle Records Written","Task Metrics.Executor Deserialize Time","Task Metrics.Shuffle Read Metrics.Total Records Read","Task Metrics.Executor Run Time")
								val metricsGroupedDf = metricsDf.groupBy(metricsDf("Stage ID")).sum()
								
						    //adding a column with the dataframe                                              
								val stageDf2 = stageDf1.withColumn("Duration(min)", round((stageDf1("Completion Time").cast("long") - stageDf1("Submission Time").cast("long")) / 60D /1000,2))
								val stageDf3 = stageDf2.select(stageDf2("Stage ID"),stageDf2("Stage Name"),stageDf2("Stage Attempt ID"),stageDf2("Number of Tasks"),from_unixtime(stageDf2("Submission Time")/1000,"yyyy-MM-dd HH:mm:ss") as "Submission Time",from_unixtime(stageDf2.col("Completion Time")/1000,"yyyy-MM-dd HH:mm:ss") as "Completion Time",stageDf2("Duration(min)"))
                
								//joining the dataframes with respect to stage ids
								val joinedDf = stageDf3.join(metricsGroupedDf,metricsGroupedDf.col("Stage ID").equalTo(stageDf3.col("Stage ID"))).drop(metricsGroupedDf.col("Stage ID"))
								val resultDf = joinedDf.select(joinedDf("Stage ID"),joinedDf("Stage Name"),joinedDf("Stage Attempt ID"),joinedDf("Number of Tasks"),joinedDf("Submission Time"),joinedDf("Completion Time"),joinedDf("Duration(min)"),joinedDf("sum(JVM GC Time)") as "JVM GC Time",joinedDf("sum(Shuffle Write Time)") as "Shuffle Write Time",joinedDf("sum(Result Serialization Time)") as "Result Serialization Time",joinedDf("sum(Shuffle Bytes Written)") as "Shuffle Bytes Written",joinedDf("sum(Result Size)") as "Result Size",joinedDf("sum(Shuffle Records Written)") as "Shuffle Records Written",joinedDf("sum(Executor Deserialize Time)") as "Executor Deserialize Time", joinedDf("sum(Total Records Read)") as "Total Records Read",joinedDf("sum(Executor Run Time)") as "Executor Run Time")
								
								//extracting the stage ids
								val stageIds = resultDf.select("Stage ID").rdd.map(r => r(0).toString()).collect
								
								readLoop()        
								
								def readLoop():Unit={
						  
						        println("Enter any stage ID listed below to view specific stage metrics or enter \"ALL\" to view all the stages :")
						        println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
						        println("Stage IDs : "+stageIds.mkString(","))
										print("Enter an option or type \"q\" to quit stage metrics :")
										//reading input from command line
										val command = reader.readLine()
										if(exitCommand.contains(command.toLowerCase())) exit()
										else{
										  //processing the command
											processCommand(command)   
											readLoop()
										}
								}

								def processCommand(c:String):Unit={
										    val tempDf = resultDf.select("Stage ID","Stage Name","Stage Attempt ID","Number of Tasks","Submission Time","Completion Time","Duration(min)","JVM GC Time","Shuffle Write Time","Result Serialization Time","Shuffle Bytes Written","Result Size","Shuffle Records Written","Executor Deserialize Time","Total Records Read","Executor Run Time")
												
										    //printing result as per user input
										    if(c=="ALL" || c=="all"){
													println("======================================== Metrics for all Stages ======================================")
													printResult(tempDf)
													println("=====================================================================================================")

												}
												else if(stageIds.contains(c)){
													val tempDf1 = tempDf.where(tempDf.col("Stage ID").equalTo(c)).select("Stage ID","Stage Name","Stage Attempt ID","Number of Tasks","Submission Time","Completion Time","Duration(min)","JVM GC Time","Shuffle Write Time","Result Serialization Time","Shuffle Bytes Written","Result Size","Shuffle Records Written","Executor Deserialize Time","Total Records Read","Executor Run Time")
													println("====================================== Metrics for Stage ID: "+c+" =====================================")
													printResult(tempDf1)
													println("======================================================================================================")
												}
												else
													println("Enter a valid Stage ID listed below..")
								}
								
								//printing stage metrics from the dataframe
								def printResult(inputDf:DataFrame){
								  inputDf.collect.foreach(r=>println(
								               "Stage ID                  : "+r(0)+"\n"
															+"Stage Name                : "+r(1)+"\n"
															+"Stage Attempt ID          : "+r(2)+"\n"
															+"Number of Tasks           : "+r(3)+"\n"
															+"Submission Time           : "+r(4)+"\n"
															+"Completion Time           : "+r(5)+"\n"
															+"Duration(min)             : "+r(6)+"\n"
															+"JVM GC Time               : "+r(7)+"\n"
															+"Shuffle Write Time        : "+r(8)+"\n"
															+"Result Serialization Time : "+r(9)+"\n"
															+"Shuffle Bytes Written     : "+r(10)+"\n"
															+"Result Size               : "+r(11)+"\n"
															+"Shuffle Records Written   : "+r(12)+"\n"
															+"Executor Deserialize Time : "+r(13)+"\n"
															+"Total Records Read        : "+r(14)+"\n"
															+"Executor Run Time         : "+r(15)+"\n"
															))
								}
								

								def exit():Unit={
										println("=================== Ending Stage Metrics ===================")
										reader.shutdown()
										JMHelp.execute("help")
								} 


					}catch {
					case ex: Throwable =>  LOGGER.error("Spark Debugger error", ex) // TODO: handle error
					}
			}  
}


