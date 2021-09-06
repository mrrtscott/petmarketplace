package com.petmarketplace.backend.models

import com.fasterxml.jackson.annotation.JsonFormat
import com.petmarketplace.backend.models.enum.AnimalSex
import com.petmarketplace.backend.models.enum.AnimalStatus
import com.petmarketplace.backend.models.enum.AnimalType
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.jetbrains.annotations.NotNull
import java.util.*
import javax.persistence.*


@Entity
class Animal {

    @Id
    private var id: UUID = UUID.randomUUID()
    @Enumerated(EnumType.STRING)
    private var type: AnimalType? = null

    private var breed: String? = null

    @NotNull
    @Enumerated(EnumType.STRING)
    private var sex:AnimalSex? = null

    private var petName:String? = null
    private var dateOfBirth:Date? = null


    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "microchip_id", referencedColumnName = "id")
    private lateinit var microchip: AnimalMicrochip

    @Column(columnDefinition = "TEXT")
    private var description: String? = null

    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinTable(
        name = "animal_lost_found",
        joinColumns = [javax.persistence.JoinColumn(name = "animalId", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "loss_found_id", referencedColumnName = "id")]

    )
    private lateinit var lostFound: List<AnimalLostFound>


    @NotNull
    @Enumerated(EnumType.STRING)
    private var status: AnimalStatus? = null

    @CreationTimestamp
    @Column(updatable = false)
    private var createdDate: Date? = null



    @UpdateTimestamp
    @Column(updatable = true)
    private var updatedDate: Date? = null

    constructor(
        type: AnimalType?,
        breed: String?,
        sex: AnimalSex?,
        petName: String?,
        dateOfBirth: Date?,
        microchip: AnimalMicrochip,
        description: String?,
        lostFound: List<AnimalLostFound>,
        status: AnimalStatus?
    ) {
        this.type = type
        this.breed = breed
        this.sex = sex
        this.petName = petName
        this.dateOfBirth = dateOfBirth
        this.microchip = microchip
        this.description = description
        this.lostFound = lostFound
        this.status = status
    }


    fun getId (): UUID{
        return this.id
    }

    fun getType(): AnimalType? {
        return this.type
    }

    fun getBreed(): String?{
        return this.breed
    }

    fun getSex(): AnimalSex?{
        return this.sex
    }

    fun getPetName(): String?{
        return this.petName
    }

    @JsonFormat(pattern = "dd-MM-yyyy")
    fun getDateOfBirth(): Date?{
        return this.dateOfBirth
    }

    fun getMicrochip(): AnimalMicrochip{
        return this.microchip
    }

    fun getDescription(): String?{
        return this.description
    }

    fun getLostFound(): List<AnimalLostFound>{
        return this.lostFound
    }

    fun getStatus(): AnimalStatus?{
        return this.status
    }

    @JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
    fun getCreatedDate(): Date?{
        return this.createdDate
    }

    @JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
    fun getUpdatedDate(): Date?{
        return this.updatedDate
    }






}