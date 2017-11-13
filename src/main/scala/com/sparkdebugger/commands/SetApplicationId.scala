package com.sparkdebugger.commands

import org.apache.log4j.Logger
import com.sparkdebugger.util.SparkConstants

object SetApplicationId extends ICommand{
	val LOGGER: Logger = Logger.getLogger(getClass.getName)
			def execute(args:String):Unit={
	          execute1(args)
      }
      def execute1(args:String):String={
					try{
						if(fileExists("hdfs://"+SparkConstants.HOST_PORT+SparkConstants.WORKING_DIRECTORY+args)) {
							//set the input args to instance variables
							    Hosts.tempArgs=args
									Search.tempArgs=args
									PartitionDetails.tempArgs=args
									FirstException.tempArgs=args
									DiskSpilled.tempArgs=args
									StageMetrics.tempArgs=args
									TaskMetrics.tempArgs=args
									JobMetrics.tempArgs=args
									ApplicationMetrics.tempArgs=args
									println("Application ID set to :" +args)
						}
						else
						  println("Application ID not found")
						  

				def fileExists(hdfsFile: String): Boolean = {
						val hadoopConf = new org.apache.hadoop.conf.Configuration()
								val fs = org.apache.hadoop.fs.FileSystem.get(hadoopConf)
								val exists = fs.exists(new org.apache.hadoop.fs.Path(hdfsFile))
								return exists
			}
			args
		}	catch {
		case ex: Throwable =>  {
  	      println("some error occurred" + ex)
  	      LOGGER.error("Spark Debugger error", ex) // TODO: handle error
  	      args
  	    }
  	     case ex: AnalysisException => {
  	       println("No metrics found in the log")
  	       args
  	     }		
		}
}

}
