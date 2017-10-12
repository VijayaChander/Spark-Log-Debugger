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

object MemoryUsed extends ICommand{
  val sc = SparkUtil().sparkContext
  val sqlContext = new org.apache.spark.sql.hive.HiveContext(sc)
  var tempArgs : String ="" 
  val LOGGER: Logger = Logger.getLogger(getClass.getName)
  
	def execute(args:String):Unit={
      try{     
        
  	    val logFile = sc.textFile("hdfs://"+SparkConstants.HOST_PORT+SparkConstants.YARN_LOG_PATH)
  	    	    
  			val log = logFile.filter(_.contains("application=")).map(lines => lines.slice(lines.indexOf("application_"), lines.lastIndexOf(">"))).distinct()
  			val schemaString = "App Id,Resources,Used Resources,num of Containers,Cluster"
  			
  			// Generate the schema based on the string of schema
  			val fields= schemaString.split(",")
  				.map(fieldName => StructField(fieldName, StringType, nullable = true))
  
  			val schema = StructType(fields)
  
  			// Convert records of the RDD to Rows
  			val rowRDD = log	
  				.map(_.split(" "))
  				.map(attributes => Row(attributes(0),attributes(1).stripPrefix("resource=<")+attributes(2).stripSuffix(">"),attributes(6).stripPrefix("usedResources=<")+attributes(7).stripSuffix(">,"),attributes(11),attributes(16).stripPrefix("cluster=<")+attributes(17).stripSuffix(">")))
  			
                
  			val memoryDf = sqlContext.createDataFrame(rowRDD, schema)
  			println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
  			memoryDf.withColumn("SNo", org.apache.spark.sql.functions.rowNumber over Window.orderBy("App Id")).select("SNo","App Id","Resources","Used Resources","num of Containers","Cluster").show(memoryDf.count().toInt,false)
  			println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
      }catch {
  	    case ex: Throwable =>  LOGGER.error("Spark Debugger error", ex) // TODO: handle error
  	}
   }
      
}