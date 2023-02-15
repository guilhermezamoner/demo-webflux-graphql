package com.example.demo.domain

data class Player(
    var id: String? = null,
    val name: String,
    val age: Int,
    val club: String,
    val nationality: String
)
