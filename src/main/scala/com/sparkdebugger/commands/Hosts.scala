package com.sparkdebugger.commands

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.types.StructField
import org.apache.spark.sql.types.StringType
import org.apache.spark.sql.types.StructType
import org.apache.spark.sql.Row
import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.expressions.Window
import org.apache.log4j.Logger
import org.apache.spark.sql.functions._
import com.sparkdebugger.util.SparkUtil
import com.sparkdebugger.util.SparkConstants

object Hosts extends ICommand{
  val sc = SparkUtil().sparkContext
  val sqlContext = new org.apache.spark.sql.hive.HiveContext(sc)
  var tempArgs : String ="" 
  val LOGGER: Logger = Logger.getLogger(getClass.getName)
  
  def execute(args:String):Unit={
  	try{	    
      val log = sc.textFile("hdfs://"+SparkConstants.HOST_PORT+SparkConstants.WORKING_DIRECTORY+tempArgs)
               
      val logExecutors = log.filter(_.contains("Log Urls"))
      val logDriver = log.filter(_.contains("Executor ID\":\"driver\""))
      val executorsDf = sqlContext.read.json(logExecutors)
      val driverDf = sqlContext.read.json(logDriver)
      
      val exDf = executorsDf.select("Executor ID","Executor Info.Host","Executor Info.Log Urls")
      val drDf = driverDf.select("Block Manager ID.Executor ID","Block Manager ID.Host")
      val drDf2 = drDf.withColumn("Executor Info.Log Urls", lit(null:String))     
      
      val resDf = drDf2.unionAll(exDf)
      println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
      resDf.show(resDf.count().toInt,false)
      println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
      
  	}catch {
  	  case ex: Throwable =>  LOGGER.error("Spark Debugger error", ex) // TODO: handle error
  	}
  }
}
