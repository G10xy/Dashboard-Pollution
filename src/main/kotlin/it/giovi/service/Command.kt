package it.giovi.service

import it.giovi.persistence.entity.CityEntity
import it.giovi.persistence.repository.CityRepository
import org.bson.types.ObjectId
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Command(val repo: CityRepository): CommandLineRunner {
    override fun run(vararg args: String?) {
        repo.deleteAll()
        val a = CityEntity(ObjectId(),"Roma",41.8933203, 12.4829321)
        val b = CityEntity(ObjectId(),"Milano",45.4642162, 9.1898182)
        val c = CityEntity(ObjectId(),"Napoli",40.8359336, 14.2487826)
        val d = CityEntity(ObjectId(),"Catania", 37.5023612, 15.0873718)

        val cities= listOf<CityEntity>(a, b, c, d)
        repo.saveAll(cities)
    }
}
