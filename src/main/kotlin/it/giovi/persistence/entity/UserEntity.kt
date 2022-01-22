package it.giovi.persistence.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank

@Document(collection = "users")
class UserEntity(
    @Id
    val id: String,

    @Email
    @Field
    @NotBlank
    val username: String,

    @Field
    @NotBlank
    val password: String,

    @Field
    @NotBlank
    val role: UserRole
    ){

    enum class UserRole {
        ADMIN,
        VISITOR
    }
}