package com.example.demo.domain

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Driver(
    @Id
        var id: Long? = null,
        val name: String,
        val brithDate: LocalDate
        )
