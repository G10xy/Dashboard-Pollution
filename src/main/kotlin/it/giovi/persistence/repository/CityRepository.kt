package it.giovi.persistence.repository

import it.giovi.persistence.entity.MainEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface CityRepository : MongoRepository<MainEntity, String> {

    fun findOneByCreatedByUser(@Param("createdBy") createdBy: String): MainEntity
}