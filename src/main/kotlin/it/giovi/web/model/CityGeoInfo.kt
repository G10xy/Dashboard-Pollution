package it.giovi.web.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "Model about city geocoding info")
data class CityGeoInfo(@JsonProperty("name") var name: String,
                       @JsonProperty("lat") var lat: Double,
                       @JsonProperty("lon") var lon: Double,
                       @JsonProperty("country") var country: String,
                       @JsonProperty("state") var state: String?)
