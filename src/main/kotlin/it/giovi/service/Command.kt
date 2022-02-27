package it.giovi.service

import it.giovi.persistence.entity.MainEntity
import it.giovi.persistence.entity.CityEntity
import it.giovi.persistence.entity.UserEntity
import it.giovi.persistence.repository.CityRepository
import it.giovi.persistence.repository.UserRepository
import org.bson.types.ObjectId
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class Command(val baseRepo: CityRepository, val userRepo: UserRepository): CommandLineRunner {
    override fun run(vararg args: String?) {
        baseRepo.deleteAll()
        userRepo.deleteAll()
        val rome = CityEntity(ObjectId().toString(),"Roma",41.8933203, 12.4829321)
        val milano = CityEntity(ObjectId().toString(),"Milano",45.4642162, 9.1898182)
        val naples = CityEntity(ObjectId().toString(),"Napoli",40.8359336, 14.2487826)
        val catania = CityEntity(ObjectId().toString(),"Catania", 37.5023612, 15.0873718)

        val documentA = MainEntity(ObjectId().toString(), hashSetOf<CityEntity>(rome, milano), LocalDateTime.now(), "desiderio.gio@yahoo.com")
        val documentB = MainEntity(ObjectId().toString(), hashSetOf<CityEntity>(naples, catania), LocalDateTime.now(), "superadmin@mail.com")
        baseRepo.save(documentA)
        baseRepo.save(documentB)
        userRepo.save(UserEntity(ObjectId().toString(), "desiderio.gio@yahoo.com", "\$2a\$12\$DnU0BDOu50O8X7lFBbrMre86kg.DFUPFIyrxQtkIsIJi8CjZ70Aim", UserEntity.UserRole.ADMIN))
    }
}
