package it.giovi.web.model

import com.fasterxml.jackson.annotation.JsonProperty


data class ResponseApiWeatherData(@JsonProperty("coord") val coord: Coordinates, @JsonProperty("list") val list: List<CityData>, @JsonProperty("city") var city: String?)
data class Coordinates(@JsonProperty("lon") val lon: Double, @JsonProperty("lat") val lat: Double)
data class PollutionData(@JsonProperty("co") val co: Double, @JsonProperty("no") val no: Double, @JsonProperty("no2") val no2: Double, @JsonProperty("o3") val o3: Double, @JsonProperty("so2") val so2: Double, @JsonProperty("pm2_5") val pm2_5: Double, @JsonProperty("pm10") val pm10: Double, @JsonProperty("nh3") val nh3: Double)
data class PollutionIndex(@JsonProperty("aqi") val aqi: Int)
data class CityData(@JsonProperty("dt") val dt: Long, @JsonProperty("main") val main: PollutionIndex, @JsonProperty("components") val components: PollutionData)

