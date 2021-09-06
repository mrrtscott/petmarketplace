package com.petmarketplace.backend.service

import com.petmarketplace.backend.models.Animal

interface AnimalService {

    fun save(animal: Animal)

}