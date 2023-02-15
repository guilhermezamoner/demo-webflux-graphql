package com.example.demo.controllers

import com.example.demo.domain.Player
import com.example.demo.domain.PlayerInput
import com.example.demo.repository.PlayerRepository
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import org.apache.logging.log4j.kotlin.logger

@Controller
class PlayerController(
    private var playerRepository: PlayerRepository
) {

    private val logger = logger()

    @QueryMapping("getAllPlayers")
    fun getAllPlayers(): Flux<Player> {
        return Flux.fromIterable(playerRepository.getAllPlayers())
    }

    @QueryMapping("getPlayersByClub")
    fun getPlayersByClub(@Argument("club") club: String): Flux<Player> {
        logger.info("getPlayersByClub - start - $club")
        return Flux.fromIterable(playerRepository.getPlayersByClub(club))
    }

    @QueryMapping("getPlayerByName")
    fun getPlayerByName(@Argument("name") name: String): Mono<Player> {
        logger.info("getPlayerByName - start - $name")
        return Mono.just(playerRepository.getPlayerByName(name))
    }

    @MutationMapping("addPlayer")
    fun addPlayer(@Argument("player") player: PlayerInput): Mono<Player> {
        return Mono.just(playerRepository.addPlayer(player.toPlayerFillID()))
    }

}