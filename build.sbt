name := "time-series-analysis"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.pageobject" % "scalatest_2.11" % "0.1.0" % "test"
libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.0.0"
libraryDependencies += "com.datastax.spark" % "spark-cassandra-connector-unshaded_2.11" % "2.0.0-M3"