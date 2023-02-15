package com.example.demo.domain

import java.util.UUID

data class PlayerInput(
    val name: String,
    val age: Int,
    val club: String,
    val nationality: String
) {
    fun toPlayerFillID(): Player {
        return Player(
            UUID.randomUUID().toString(),
            name,
            age,
            club,
            nationality
        )
    }
}
