package com.petmarketplace.backend.models

import com.fasterxml.jackson.annotation.JsonFormat
import com.petmarketplace.backend.models.enum.PhotoType
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class AnimalPhoto {

    @Id
    private var id: UUID = UUID.randomUUID()
    private var name: String? = null
    private var path: String? = null
    private var url: String? = null
    private var type: PhotoType? = null
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

    fun getName(): String?{
        return this.name
    }

    fun getPath():String?{
        return this.path
    }

    fun getUrl(): String?{
        return this.url
    }

    fun getType(): PhotoType?{
        return this.type
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