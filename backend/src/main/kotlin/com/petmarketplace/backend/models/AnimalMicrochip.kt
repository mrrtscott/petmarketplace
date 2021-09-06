package com.petmarketplace.backend.models

import com.fasterxml.jackson.annotation.JsonFormat
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class AnimalMicrochip {

    @Id
    private var id: UUID = UUID.randomUUID()
    private var isChipped: Boolean? = null
    private var microchipNumber: Long? = null
    private var veterinarian: String? = null
    private var facility: String? = null
    private var dateOfImplant: Date? = null
    private var isPublic: Boolean? = null

    @CreationTimestamp
    @Column(updatable = false)
    private var createdDate: Date? = null


    @UpdateTimestamp
    @Column(updatable = true)
    private var updatedDate: Date? = null


    fun getId(): UUID{
        return this.id
    }

    fun getIsChipped(): Boolean?{
        return this.isChipped
    }

    fun getMicrochipNumber(): Long?{
        return this.microchipNumber
    }

    fun getVeterinarian(): String?{
        return this.veterinarian
    }

    fun getFacility(): String?{
        return this.facility
    }

    fun getDateOfImplant(): Date?{
        return this.dateOfImplant
    }

    fun getIsPublic(): Boolean?{
        return this.isPublic
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