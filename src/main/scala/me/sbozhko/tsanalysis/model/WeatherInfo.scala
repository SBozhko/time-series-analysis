package me.sbozhko.tsanalysis.model

case class WeatherInfo(
  station: String,
  stationName: String,
  latitude: Double,
  longitude: Double,
  date: Long,
  tMax: Double,
  tMin: Double)


object WeatherInfo {

  def fromCsv(): WeatherInfo = {

  }

}