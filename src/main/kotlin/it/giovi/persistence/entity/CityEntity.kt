package it.giovi.persistence.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "pollutionColl")
class CityEntity(
    @Id
    val id: ObjectId,
    val name: String,
    val lat: Double,
    val lon: Double) {
}