package com.sparkdebugger.commands


import org.apache.log4j.Logger
import org.apache.spark.sql.functions._
import com.sparkdebugger.util.SparkUtil
import com.sparkdebugger.util.SparkConstants

object ApplicationMetrics extends ICommand {
	    val sc = SparkUtil().sparkContext
			val sqlContext = new org.apache.spark.sql.hive.HiveContext(sc)
			var tempArgs : String ="" 
			val LOGGER: Logger = Logger.getLogger(getClass.getName)

			def execute(args:String):Unit={
					try{        
					      //reading log file
						    val log = sc.textFile("hdfs://"+SparkConstants.HOST_PORT+SparkConstants.WORKING_DIRECTORY+tempArgs)      

					    //filtering log file based upon certain conditions
							val appLog = log.filter(_.contains("App ID"))
							val appEndLog = log.filter(_.contains("SparkListenerApplicationEnd"))
              
							//creating dataframe from the filtered log file
							val appDf = sqlContext.read.json(appLog).select("App Name","App ID","User","Timestamp").withColumnRenamed("Timestamp", "Submission Time")  
							val appEndDf = sqlContext.read.json(appEndLog).select("Timestamp").withColumnRenamed("Timestamp", "Completion Time")
							val applnDf = appDf.join(appEndDf)
							
						  //adding a column with the dataframe
						  val resultDf = applnDf.withColumn("Duration(min)", round((applnDf.col("Completion Time").cast("long") - applnDf.col("Submission Time").cast("long")) / 60D /1000,2))
                                                                                                                             									
							println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
							resultDf.select(resultDf("App Name"),resultDf("App ID"),resultDf("User"),from_unixtime(resultDf("Submission Time")/1000,"yyyy-MM-dd HH:mm:ss") as "Submission Time", from_unixtime(resultDf("Completion Time")/1000,"yyyy-MM-dd HH:mm:ss") as "Completion Time", resultDf("Duration(min)")).show(resultDf.count().toInt,false)
							println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
							
							JMHelp.execute("help")
								
					}catch {
					case ex: Throwable =>  {
  	      println("some error occurred"+ ex)
  	      LOGGER.error("Spark Debugger error", ex) // TODO: handle error
  	    }
  	     case ex: AnalysisException => println("No metrics found in the log")
					}
			}  
}
