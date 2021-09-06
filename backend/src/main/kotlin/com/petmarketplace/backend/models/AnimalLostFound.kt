package com.petmarketplace.backend.models

import com.fasterxml.jackson.annotation.JsonFormat
import com.petmarketplace.backend.models.enum.AnimalMissingStatus
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.jetbrains.annotations.NotNull
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class AnimalLostFound {

    @Id
    private var id: UUID = UUID.randomUUID()
    private var lastLocationStreet: String? = null
    private var lastLocationCity: String? = null
    private var lastLocationParish: String? = null
    private var lastLocationCountry: String? = null
    private var dateLastSeen: Date? = null

    @Column(columnDefinition = "TEXT")
    private var details: String? = null

    @NotNull
    private var status: AnimalMissingStatus? = null


    private var isRewardOffered: Boolean? = null


    @CreationTimestamp
    @Column(updatable = false)
    private var createdDate: Date? = null


    @UpdateTimestamp
    @Column(updatable = true)
    private var updatedDate: Date? = null


    //Constructor

    constructor(
        lastLocationStreet: String?,
        lastLocationCity: String?,
        lastLocationParish: String?,
        lastLocationCountry: String?,
        dateLastSeen: Date?,
        details: String?,
        status: AnimalMissingStatus?,
        isRewardOffered: Boolean?
    ) {
        this.lastLocationStreet = lastLocationStreet
        this.lastLocationCity = lastLocationCity
        this.lastLocationParish = lastLocationParish
        this.lastLocationCountry = lastLocationCountry
        this.dateLastSeen = dateLastSeen
        this.details = details
        this.status = status
        this.isRewardOffered = isRewardOffered
    }




    //Getters

    fun getId (): UUID{
        return this.id
    }

    fun getLastLocationStreet(): String?{
        return this.lastLocationStreet
    }

    fun getLastLocationCity(): String?{
        return this.lastLocationCity
    }

    fun getLastLocationParish(): String?{
        return this.lastLocationParish
    }

    fun getLastLocationCountry(): String?{
        return this.lastLocationCountry
    }

    fun getStatus(): AnimalMissingStatus?{
        return this.status
    }

    fun getIsRewardOffered(): Boolean?{
        return this.isRewardOffered
    }

    @JsonFormat(pattern="dd-MM-yyyy")
    fun getDateLastSeen(): Date?{
        return this.dateLastSeen
    }

    fun getDetails(): String?{
        return this.details
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