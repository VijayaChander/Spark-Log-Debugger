package com.sparkdebugger.commands

object JobMetricsCommand {
  val commands = Vector(
    JMCommand("help", JMHelp),
    JMCommand("1", ApplicationMetrics),
    JMCommand("2", JobMetrics),
    JMCommand("3", StageMetrics),
    JMCommand("4", TaskMetrics)
  )
}

case class JMCommand(cmd:String, process:ICommand, help:String="")
