package com.sparkdebugger.commands

object Help extends ICommand{
  def execute(args:String):Unit={
    execute1("help")
  }
  def execute1(args:String):String={
    println("=========================================")
    println("Usage: " + System.lineSeparator() +
    "1. allApplicationIds" + System.lineSeparator() +
    "2. setApplicationId" + System.lineSeparator() +
     "\t"+" 1. search \"term\"" + System.lineSeparator() +
     "\t"+" 2. hosts" + System.lineSeparator() +
     "\t"+" 3. firstException" + System.lineSeparator() +
     "\t"+" 4. executors-hosts-partitions" + System.lineSeparator() +
     "\t"+" 5. disk-memory-usage" + System.lineSeparator() +
     "\t"+" 6. jobMetrics" + System.lineSeparator() +
    "3. memoryUsed" + System.lineSeparator() +
    "4. exit"
    )
    val helpString = "Usage: " + System.lineSeparator() +
    "1. allApplicationIds" + System.lineSeparator() +
    "2. setApplicationId" + System.lineSeparator() +
     "\t"+" 1. search \"term\"" + System.lineSeparator() +
     "\t"+" 2. hosts" + System.lineSeparator() +
     "\t"+" 3. firstException" + System.lineSeparator() +
     "\t"+" 4. executors-hosts-partitions" + System.lineSeparator() +
     "\t"+" 5. disk-memory-usage" + System.lineSeparator() +
     "\t"+" 6. jobMetrics" + System.lineSeparator() +
    "3. memoryUsed" + System.lineSeparator() +
    "4. exit"
    println("=========================================")
    helpString
  }
   
}