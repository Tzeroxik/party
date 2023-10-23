package com.shroomander.party.web.api.controller.user

import com.shroomander.party.web.api.view.user.User
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/user")
class UserController {

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getUsers() : ResponseEntity<List<User>> {
        val users = listOf(User(1L, "Adriano"))
        return ResponseEntity(users, HttpStatus.OK)
    }
}