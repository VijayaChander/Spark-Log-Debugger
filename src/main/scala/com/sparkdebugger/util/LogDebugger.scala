package com.sparkdebugger.util
import org.apache.log4j.Logger

object LogDebugger {
  val LOGGER: Logger = Logger.getLogger(getClass.getName)
    def main(args : Array[String]){
    try{
      //user defined property file
      val configFile = if(args.length>0) Some(args(0)) else None
       val sc = SparkUtil(configFile).sparkContext
       Terminal.startTerminal()
    }
    catch {
  	    case ex: Throwable =>  LOGGER.error("Spark Debugger error", ex) // TODO: handle error
  	}
  	finally{
  	  
  	}
}
}