package it.giovi.web

data class Pojo (
    val name: String,
    val lat: Double,
    val lon: Double,
    val country: String,
    val state: String? = null
)
