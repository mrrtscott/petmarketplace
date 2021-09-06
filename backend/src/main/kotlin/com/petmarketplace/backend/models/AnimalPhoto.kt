package com.petmarketplace.backend.models

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



}