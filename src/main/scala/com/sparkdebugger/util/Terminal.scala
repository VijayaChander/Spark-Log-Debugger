package com.sparkdebugger.util

import jline.console.ConsoleReader
import com.sparkdebugger.commands.{Command, CommandSink, Help}
import java.io.PrintWriter
import scala.annotation.Annotation
import org.slf4j.{Logger, LoggerFactory}


object Terminal {
 
    val LOGGER:Logger = LoggerFactory.getLogger(this.getClass)
    val reader:ConsoleReader =new ConsoleReader
    val writer = new PrintWriter(reader.getTerminal.wrapOutIfNeeded(System.out))
   
		            
     var title = raw"""
                      |   ____               __         _       _                      
                      |  / __/__   ___  ____/ /__    __/ /__   / /_     __   __   __   ____
                      |  _\ \/ _ \/ _ `/ __/  '_/__ /__ //__\ /__ //  // _ \/ _ \/__\ / __/
                      | /___/ .__/\_,_/_/ /_/\_\   /__ / \__ /__ //__/ \_  /\_  /\__ /_/        version 1.0
                      |    /_/                                         _/ / _/ /
                      |                                                \_/  \_/
                      |
                      |Using Scala 2.10.4 Java HotSpot(TM) 64-Bit Server VM Java 1.8.0_51
                      |Type "help" for more information.
                      |
                      """.stripMargin
     val prompt = "scDebugger>"
     val exitCommand = List("exit","quit","\u0004","q")

     
     def init():Unit={
      put(title)
      reader.setPrompt(prompt)
      reader.setHistoryEnabled(true)
      writer.flush()
    }
    
    def startTerminal():Unit={
      init()
      readLoop()
    }
    
    def put(s:String):Unit={
      writer.println(s)
      writer.flush()
    }
    
    def get():String =  reader.readLine()
    
    def processCommand(c:String):Unit={
      val (cmd,param) = c.span(_ !=' ')
      val commandExec:Command = CommandSink.commands.find(_.cmd == cmd.toLowerCase()).getOrElse(Command("help",Help))
      commandExec.process.execute(param.trim)
    }
    
    def readLoop():Unit={
      val command = get()
      if(exitCommand.contains(command.toLowerCase())) exit()
      processCommand(command)   
      readLoop()
    }
    
    def exit():Unit={
      put("=================== Ending session ===================")
      reader.shutdown()
      SparkUtil().sparkContext.stop()
      sys.exit(0)
    }
    
}