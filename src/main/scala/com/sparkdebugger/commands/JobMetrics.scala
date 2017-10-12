package com.sparkdebugger.commands

import com.sparkdebugger.util.SparkUtil
import org.apache.log4j.Logger
import jline.console.ConsoleReader
import org.apache.spark.sql.functions._ 
import com.sparkdebugger.util.SparkUtil
import com.sparkdebugger.util.SparkConstants

object JobMetrics extends ICommand{
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
								val jobLog = log.filter(_.contains("Job ID")).filter(_.contains("Submission Time"))
								val jobCompletionLog = log.filter(_.contains("Job ID")).filter(_.contains("Completion Time"))
								
								//creating dataframes from the filtered log files
								val jobDf1 = sqlContext.read.json(jobLog).select("Job ID","Submission Time","Stage IDs")
								val jobDf2 = sqlContext.read.json(jobCompletionLog).select("Job ID" ,"Completion Time", "Job Result.Result")  
                val joinedDf = jobDf1.join(jobDf2,jobDf1.col("Job ID").equalTo(jobDf2.col("Job ID"))).drop(jobDf2.col("Job ID"))
                
                //adding a column with the dataframe
				        val jobDf = joinedDf.withColumn("Duration(min)", round((joinedDf("Completion Time").cast("long") - joinedDf("Submission Time").cast("long")) / 60D /1000,2))
								val resultDf = jobDf.select(jobDf("Job ID"),from_unixtime(jobDf("Submission Time")/1000,"yyyy-MM-dd HH:mm:ss") as "Submission Time",from_unixtime(jobDf.col("Completion Time")/1000,"yyyy-MM-dd HH:mm:ss") as "Completion Time",jobDf("Duration(min)"),jobDf("Stage IDs"),jobDf("Result") as "Job Status")
								
								//extracting the job ids
								val jobIds = resultDf.select("Job ID").rdd.map(r => r(0).toString()).collect()

								readLoop()
								
								def readLoop():Unit={
										
												println("Enter any Job ID listed below to view specific Job metrics or enter \"ALL\" to view all the jobs :")
						            println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
												println("Job IDs : "+jobIds.mkString(","))
										    print("Enter an option or type \"q\" to quit Job metrics :")
												//reading input from command line
										    val command = reader.readLine()
												if(exitCommand.contains(command.toLowerCase()))	exit()
												else{
											  //processing the command
												processCommand(command)   
												readLoop()
												}
								}

								def processCommand(c:String):Unit={
										if(c=="ALL" || c=="all")
											  resultDf.show(resultDf.count().toInt,false)
										else if(jobIds.contains(c)){
												println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
												resultDf.where(resultDf.col("Job ID").equalTo(c)).select("Job ID","Submission Time","Completion Time","Duration(min)","Stage IDs","Job Status").show(resultDf.count().toInt,false)
												println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
										  }
										else
											  println("Enter a valid Job ID listed below..")
											  
									  
										
								}

								def exit():Unit={
										println("=================== Ending Job Metrics ===================")
										reader.shutdown()
										JMHelp.execute("help")
										//JobMetricsTerminal.readLoop()
								}    

					      }catch {
					          case ex: Throwable =>  LOGGER.error("Spark Debugger error", ex) // TODO: handle error
					}
			}  
}



