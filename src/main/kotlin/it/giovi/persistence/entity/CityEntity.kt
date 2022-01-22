package it.giovi.persistence.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime
import java.util.*

@Document(collection = "pollutionColl")
class CityEntity(
    @Id
    val id: String,
    val name: String,
    val lat: Double,
    val lon: Double,
    createdAt: LocalDateTime,
    createdByUser: String) : AuditMetadata(createdAt, createdByUser)
