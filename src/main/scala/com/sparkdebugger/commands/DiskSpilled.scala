package com.sparkdebugger.commands

import org.json4s.jackson.JsonMethods.parse
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
import org.apache.spark.sql.types.IntegerType
import org.json4s.JsonAST.JObject
import com.sparkdebugger.util.SparkUtil
import com.sparkdebugger.util.SparkConstants


object DiskSpilled extends ICommand{  
    
 val sc = SparkUtil().sparkContext
  val sqlContext = new org.apache.spark.sql.hive.HiveContext(sc)
  var tempArgs : String ="" 
  val LOGGER: Logger = Logger.getLogger(getClass.getName)
  
  
  def execute(args:String):Unit={
    try{val log = sc.textFile("hdfs://"+SparkConstants.HOST_PORT+SparkConstants.WORKING_DIRECTORY+tempArgs)
    
    val maxMemoryLog = log.filter(_.contains("Maximum Memory"))
    val maxMemoryDf = sqlContext.read.json(maxMemoryLog).select("Block Manager ID.Executor ID","Block Manager ID.Host","Maximum Memory")

    
    val diskMemoryLog = log.filter(_.contains("SparkListenerTaskEnd")).filter(_.contains("Memory Size")).filter(_.contains("Disk Size"))
    val diskMemoryDf = sqlContext.read.json(diskMemoryLog).select("Task Info.Executor ID","Task Metrics.Updated Blocks.Status.Memory Size","Task Metrics.Updated Blocks.Status.Disk Size")

    
    val diskSpilledDf = diskMemoryDf.groupBy(diskMemoryDf("Executor ID") as "ExecutorID").agg(sum(diskMemoryDf("Memory Size").getItem(0)) as "Memory Used" ,sum(diskMemoryDf("Disk Size").getItem(0)) as "Disk Spilled")

    val joinedDf = maxMemoryDf.join(diskSpilledDf,maxMemoryDf.col("Executor ID").equalTo(diskSpilledDf.col("ExecutorID")))      
    
    val underUtilDf = joinedDf.withColumn("Unused memory", joinedDf.col("Maximum Memory")-joinedDf.col("Memory Used"))

    val isDisk = underUtilDf.select("Disk Spilled").rdd.map(f=>f(0).toString()).collect()    
    val isDiskCount = isDisk.filter(_.matches("0")).length    
    
    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    if(underUtilDf.count() == isDiskCount)
      underUtilDf.orderBy(underUtilDf("Executor ID")).select(underUtilDf("Executor ID"),round(underUtilDf("Maximum Memory")/1048576) as "Maximum Memory(MB)",round(underUtilDf("Memory Used")/1048576) as "Memory Used(MB)",round(abs(underUtilDf("Unused memory")/1048576)) as "Unused Memory(MB)").show(underUtilDf.count().toInt,false)
    else
      underUtilDf.orderBy(underUtilDf("Executor ID")).select(underUtilDf("Executor ID"),round(underUtilDf("Maximum Memory")/1048576) as "Maximum Memory(MB)",round(underUtilDf("Memory Used")/1048576) as "Memory Used(MB)",round(underUtilDf("Disk Spilled")/1048576) as "Disk Spilled(MB)").show(underUtilDf.count().toInt,false)
    println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<") 

  

    }catch {
      case ex: Throwable =>  LOGGER.error("Spark Debugger error", ex) // TODO: handle error
    }

   
  }
}
