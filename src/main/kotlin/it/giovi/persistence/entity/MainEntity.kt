package it.giovi.persistence.entity

import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.time.LocalDateTime
import javax.validation.constraints.Email


@Document(collection = "pollutionColl")
class MainEntity(

    @Id
    val id: String,

    @Field
    var cities: MutableSet<CityEntity>,

    @Field
    @CreatedDate
    var createdAt: LocalDateTime,

    @Field
    @Email
    @CreatedBy
    var createdByUser: String){

        fun removeCity (cityName: String){
            this.cities.removeIf { city -> city.name == cityName }
        }
    }
