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
import com.sparkdebugger.util.SparkUtil
import com.sparkdebugger.util.SparkConstants

object PartitionDetails extends ICommand{
  
  val sc = SparkUtil().sparkContext
  val sqlContext = new org.apache.spark.sql.hive.HiveContext(sc)
  var tempArgs : String ="" 
  val LOGGER: Logger = Logger.getLogger(getClass.getName)
  		
  def execute(args:String):Unit={   
  	try{
    val logFile = sc.textFile("hdfs://"+SparkConstants.HOST_PORT+SparkConstants.WORKING_DIRECTORY+tempArgs)
    
    val log = logFile.filter(_.contains("Task Info")).filter(!_.contains("Task Type")).map(lines => lines.slice(lines.indexOf("Stage ID"),lines.lastIndexOf("}")))
    val schemaString = "Executor Id,Host,Stage Id,Partition Id"
    // Generate the schema based on the string of schema
    val fields = schemaString.split(",")
              .map(fieldName => StructField(fieldName, StringType, nullable = true))
    
    val schema = StructType(fields)
     
    var counter = 0                                  
    // Convert records of the RDD to Rows
    val rowRDD = log
      .map(_.split(","))
      .map(attributes => Row("Executor("+attributes(6).split("\"")(3)+")",attributes(7).split("\"")(3),"Stages :"+attributes(0).split(":")(1),"Partition: "+attributes(2).split("\"")(4).stripPrefix("\"")))
    
    import sqlContext.implicits._
    import org.apache.spark.sql.functions._
    
    // Apply the schema to the RDD
    val searchDF = sqlContext.createDataFrame(rowRDD, schema)
    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    searchDF.withColumn("SNo", org.apache.spark.sql.functions.rowNumber over Window.orderBy("Stage Id")).select("SNo","Executor Id","Host","Stage Id", "Partition Id").show(searchDF.count().toInt,false)
    println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
   }catch {
  	   case ex: Throwable =>  {
  	      println("some error occurred")
  	      LOGGER.error("Spark Debugger error", ex) // TODO: handle error
  	    }
  	     case ex: AnalysisException => println("No metrics found in the log")
  	}
  }
}
