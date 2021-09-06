package com.petmarketplace.backend.service.implemention

import com.petmarketplace.backend.models.Animal
import com.petmarketplace.backend.repository.AnimalRepository
import com.petmarketplace.backend.service.AnimalService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class AnimalServiceImplementation : AnimalService {

    @Autowired
    private lateinit var animalRepository: AnimalRepository


    override fun save(animal: Animal) {
        animalRepository.save(animal)
    }

}