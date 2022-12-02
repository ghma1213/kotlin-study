package com.hooney.kotlinstudy.data.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Todo (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    var title: String,
    var content: String,
    var writer: String
)