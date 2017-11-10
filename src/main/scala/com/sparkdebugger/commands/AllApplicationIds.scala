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


object AllApplicationIds extends ICommand{
   val sc = SparkUtil().sparkContext
   val sqlContext = new org.apache.spark.sql.hive.HiveContext(sc)
	 val logFile = sc.textFile("hdfs://"+SparkConstants.HOST_PORT+SparkConstants.YARN_LOG_PATH)
	 val LOGGER: Logger = Logger.getLogger(getClass.getName)
	 
   def execute(args:String):Unit={ 
     execute1("")
  }
  def execute1(args:String):String={
    try{
        val log = logFile.filter(_.contains("appId="))
				val schemaString = "Date&Time,ApplicationID,Application Name"

				// Generate the schema based on the string of schema
				val fields = schemaString.split(",")
				.map(fieldName => StructField(fieldName, StringType, nullable = true))
				  
				val schema = StructType(fields)

				// Convert records of the RDD to Rows
				val rowRDD = log
				.map(_.split(" "))
				.map(attributes => Row(attributes(0)+" "+attributes(1).split(",")(0),attributes(4).split(",")(0).stripPrefix("appId="),attributes(4).split(",")(1).stripPrefix("name=")))

				// Apply the schema to the RDD
				val tempDF = sqlContext.createDataFrame(rowRDD, schema)
			  val appDF = tempDF.groupBy("ApplicationID","Application Name").agg(max("Date&Time")as "Date&Time")

		    println("Recent Spark Applications:")
			  println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
				val res = appDF.withColumn("SNo", org.apache.spark.sql.functions.rowNumber over Window.orderBy(desc("Date&Time"))).select("SNo","ApplicationID","Application Name","Date&Time")
			  res.show(appDF.count().toInt,false)
				println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
			  //res.collect().foreach(f=>f.toString()).toString()
				res.select("ApplicationID").collect().map(_.getString(0)).mkString(" ")
     }catch {
  	    case ex: Throwable =>  {
  	      println("some error occurred")
  	      LOGGER.error("Spark Debugger error", ex) // TODO: handle error
  	      ex.printStackTrace().toString()
  	    }
  	     case ex: AnalysisException => {
  	       println("No metrics found in the log")
  	       ex.printStackTrace().toString()
  	     }
  	}
  }
}
