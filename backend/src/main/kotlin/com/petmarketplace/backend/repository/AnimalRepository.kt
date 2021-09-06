package com.petmarketplace.backend.repository

import com.petmarketplace.backend.models.Animal
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface AnimalRepository : JpaRepository<Animal, UUID> {
}