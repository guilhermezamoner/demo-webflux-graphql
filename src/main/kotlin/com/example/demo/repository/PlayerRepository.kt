package com.example.demo.repository

import com.example.demo.domain.Player
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class PlayerRepository {

    var players = mutableListOf(
        Player(UUID.randomUUID().toString(), "Kante", 30, "Chelsea", "France"),
        Player(UUID.randomUUID().toString(), "Sterling", 30, "Chelsea", "England"),
        Player(UUID.randomUUID().toString(), "Martinelli", 22, "Arsenal", "Brazil"),
        Player(UUID.randomUUID().toString(), "Casemiro", 30, "Man United", "Brazil"),
        Player(UUID.randomUUID().toString(), "Haaland", 23, "Man City", "Norway"),
        Player(UUID.randomUUID().toString(), "Salah", 30, "Liverpool", "Egypt"),
        Player(UUID.randomUUID().toString(), "Gakpo", 25, "Liverpool", "Netherlands")
    )

    fun addPlayer(player: Player): Player{
        players.add(player)
        return player
    }

    fun getAllPlayers(): List<Player> = players

    fun getPlayersByClub(club: String): List<Player>{
        return players.filter { it.club == club }
    }

    fun getPlayerByName(name: String): Player{
        return players.first { it.name == name }
    }

}