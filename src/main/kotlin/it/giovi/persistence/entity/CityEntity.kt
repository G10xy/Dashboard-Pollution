package it.giovi.persistence.entity

import org.springframework.data.annotation.Id

class CityEntity(
    @Id
    val id: String,
    val name: String,
    val lat: Double,
    val lon: Double)
