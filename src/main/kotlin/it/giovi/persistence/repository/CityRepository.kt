package it.giovi.persistence.repository

import it.giovi.persistence.entity.CityEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CityRepository : MongoRepository<CityEntity, String> {
}