package com.sparkdebugger.commands

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.types.StructField
import org.apache.spark.sql.types.StringType
import org.apache.spark.sql.types.StructType
import org.apache.spark.sql.Row
import org.apache.spark.sql.SQLContext
import scala.util.control.Breaks._
import scala.util.control.Breaks
import org.apache.log4j.Logger
import com.sparkdebugger.util.SparkUtil
import com.sparkdebugger.util.SparkConstants

object FirstException extends ICommand{
  
  val sc = SparkUtil().sparkContext
  val sqlContext = new SQLContext(sc)
  var tempArgs : String =""  
  val LOGGER: Logger = Logger.getLogger(getClass.getName)

  def execute(args:String):Unit={ 
    try{
	  val log = sc.textFile("hdfs://"+SparkConstants.HOST_PORT+SparkConstants.EXP_LOG_PATH+tempArgs)
	  var count = 1
	  for(lines<-log){
     if(count == 1){
         if(lines.contains("Exception"))
            count+=1
         }  
         if(count>1 && count <30){
            println(lines)
            count+=1
         }
    }

   }catch {
  	    case ex: Throwable =>  {
  	      println("some error occurred")
  	      LOGGER.error("Spark Debugger error", ex) // TODO: handle error
  	    }
  	     case ex: AnalysisException => println("No metrics found in the log")
  	}
  }
}
