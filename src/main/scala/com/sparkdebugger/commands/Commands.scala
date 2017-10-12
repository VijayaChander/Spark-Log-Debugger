package com.sparkdebugger.commands

import com.sparkdebugger.util.JobMetricsTerminal


object CommandSink{
  val commands = Vector(
    Command("help", Help),
    Command("search", Search),
    Command("allapplicationids", AllApplicationIds),
    Command("setapplicationid", SetApplicationId),
    Command("firstexception", FirstException),
    Command("hosts", Hosts),
    Command("executors-hosts-partitions",PartitionDetails),
    Command("memoryused", MemoryUsed),
    Command("disk-memory-usage", DiskSpilled),
    Command("jobmetrics", JobMetricsTerminal)
  )
}

case class Command(cmd:String, process:ICommand, help:String="")
