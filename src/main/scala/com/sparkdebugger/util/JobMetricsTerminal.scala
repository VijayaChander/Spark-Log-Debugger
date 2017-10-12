package com.sparkdebugger.util

import jline.console.ConsoleReader
import java.io.PrintWriter
import scala.annotation.Annotation
import org.slf4j.{Logger, LoggerFactory}
import com.sparkdebugger.commands.{ICommand,JMCommand,JobMetricsCommand,JMHelp}

object JobMetricsTerminal extends ICommand{
  
    val LOGGER:Logger = LoggerFactory.getLogger(this.getClass)
    val JMreader:ConsoleReader =new ConsoleReader
    val writer = new PrintWriter(JMreader.getTerminal.wrapOutIfNeeded(System.out))

     val exitCommand = List("exit","quit","\u0004","5")
     
     def init():Unit={
     
      JMreader.setHistoryEnabled(true)
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
    
    def get():String =  JMreader.readLine()
    
    def processCommand(c:String):Unit={

      val (cmd,param) = c.span(_ !=' ')
      val commandExec:JMCommand = JobMetricsCommand.commands.find(_.cmd == cmd.toLowerCase()).getOrElse(JMCommand("help",JMHelp))
      commandExec.process.execute(param.trim)
    }
    
    def readLoop():Unit={
      print("Enter a option listed above to view specified metrics :")
      val command = get()
      if(exitCommand.contains(command.toLowerCase())) exit()
      processCommand(command)   
      readLoop()
    }
    
    def exit():Unit={
      put("=================== Ending Job Metrics ===================")
      JMreader.shutdown()
      Terminal.readLoop()
    }
    def execute(args:String):Unit={      
      JMHelp.execute("help")
      JobMetricsTerminal.startTerminal()
    }
    
}