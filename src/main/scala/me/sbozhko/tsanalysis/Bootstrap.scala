package me.sbozhko.tsanalysis

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object Bootstrap {

  def main(args: Array[String]) {
    val sparkConfig = new SparkConf().setAppName("time-series-analysis").setMaster("local[2]")
    val sc = new SparkContext(sparkConfig)



  }

}
