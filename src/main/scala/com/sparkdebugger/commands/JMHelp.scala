package com.sparkdebugger.commands

object JMHelp extends ICommand{
  def execute(args:String):Unit={
    println("============== Job Metrics ==============")
    println("Usage: " + System.lineSeparator() +
    "1. Application" + System.lineSeparator() +
    "2. Job" + System.lineSeparator() +     
    "3. Stage" + System.lineSeparator() +
    "4. Task" + System.lineSeparator() +
    "5. Exit"
    )
    println("=========================================")
    
  }
   
}