package com.sparkdebugger.util

import org.apache.spark.{SparkConf, SparkContext}
import scala.collection.JavaConversions._
import java.util.Properties
import java.io.File
import com.typesafe.config.{Config, ConfigFactory}
import org.apache.commons.io.FileUtils


class SparkUtil private(val configPath : Option[String]){
  
	  val sparkContext:SparkContext = {
	  val sparkConf:SparkConf = new SparkConf()
	  if(configPath != None){
      val clusterConfig = getConfig(configPath)
			val configMap = clusterConfig.getConfig(SparkConstants.SPARK_PROPERTY).entrySet().toList
			.map(entry => (entry.getKey,
					entry.getValue.unwrapped().toString)
					).toMap
      configMap.foreach { keyValue => 
			sparkConf.set(keyValue._1,keyValue._2)
			}
      
      
		}
	  sparkConf.setAppName(SparkConstants.APP_NAME)
		new SparkContext(sparkConf)

}

def getConfig(c: Option[String]): Config = {
			    val path = c.getOrElse{
			      throw new ExceptionInInitializerError("No config file specified")
			    }
					val configFile :File = (Option(new File(path))).getOrElse{
					  throw new ExceptionInInitializerError("Configuration file not found in path" + path)
					}
					ConfigFactory.parseFile(configFile)
	    }

}

object SparkUtil{
  private var instance : SparkUtil = _
  
  def apply(): SparkUtil = {
    if(instance == null){
      instance = new SparkUtil(None)
    }
    instance
  }
  
  def apply(conf : Option[String]): SparkUtil = {
    if(instance == null){
      instance = new SparkUtil(conf)
    }
    instance
    }
  }






