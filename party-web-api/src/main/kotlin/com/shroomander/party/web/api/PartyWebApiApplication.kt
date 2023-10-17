package com.shroomander.party.web.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PartyWebApiApplication

fun main(args: Array<String>) {
    runApplication<PartyWebApiApplication>(*args)
}
