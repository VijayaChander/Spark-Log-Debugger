package com.sparkdebugger.commands

import org.scalatest._

import com.sparkdebugger.util.Terminal

class SparkTest extends FunSuite with Matchers {
  test("terminal prompt"){
      Terminal.prompt should be ("scDebugger>")
    }
  test("print the application id from the log file"){   
    var regexPat = "([a-z]+)_([0-9]+)_([0-9]+)".r
    AllApplicationIds.execute1("") should include regex (regexPat)
  }
  test("set application id"){
    var regexPat = "([a-z]+)_([0-9]+)_([0-9]+)".r
    SetApplicationId.execute1("application_1493795227502_5181") should include regex (regexPat)
  }
  test("set application id - failure test case"){
    var regexPat = "^([0-9]+)_([0-9]+)".r
    SetApplicationId.execute1("application_1493795227502_5181") should not include regex (regexPat)
  }
  test("test the help command"){
      Help.execute1("help") should include (
    "Usage: " + System.lineSeparator() +
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
    }
}
