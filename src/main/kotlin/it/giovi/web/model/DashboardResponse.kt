package com.example.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

data class DashboardResponse(@JsonProperty("city") var city: String?, @JsonProperty("aqi") var aqi: Int?, @JsonProperty("date") var date: LocalDateTime?, @JsonProperty("co") val co: Double, @JsonProperty("no") val no: Double, @JsonProperty("no2") val no2: Double, @JsonProperty("o3") val o3: Double, @JsonProperty("so2") val so2: Double, @JsonProperty("pm2_5") val pm2_5: Double, @JsonProperty("pm10") val pm10: Double, @JsonProperty("nh3") val nh3: Double)
