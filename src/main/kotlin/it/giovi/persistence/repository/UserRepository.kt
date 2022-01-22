package it.giovi.persistence.repository

import it.giovi.persistence.entity.UserEntity
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : MongoRepository<UserEntity, String> {

    fun findByUsername(@Param("username") username: String) : UserEntity?
}