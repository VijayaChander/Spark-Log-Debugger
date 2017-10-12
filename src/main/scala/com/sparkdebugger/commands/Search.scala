package com.sparkdebugger.commands

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.log4j.Logger
import com.sparkdebugger.util.SparkUtil
import com.sparkdebugger.util.SparkConstants

object Search extends ICommand{  

  val sc = SparkUtil().sparkContext
  var tempArgs : String ="" 
	val LOGGER: Logger = Logger.getLogger(getClass.getName)

	def execute(args:String):Unit={ 
    try{	       
	    val log = sc.textFile("hdfs://"+SparkConstants.HOST_PORT+SparkConstants.WORKING_DIRECTORY+tempArgs)
			val filter = log.filter(_.contains(args))
			println("Search Result for "+args)
			println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
		  if(filter.count() == 0)
		      println("Search text not found")
		  else	      
			    filter.collect.foreach(println)
		  println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
    }catch {
  	    case ex: Throwable =>  LOGGER.error("Spark Debugger error", ex) // TODO: handle error
  	}
	} 
}