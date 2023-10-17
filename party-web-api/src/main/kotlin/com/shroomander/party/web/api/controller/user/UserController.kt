package com.shroomander.party.web.api.controller.user

import com.shroomander.party.web.api.view.user.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/user")
class UserController {

    @GetMapping
    fun user() : List<User> {
        return listOf(User(1L, "Adriano"))
    }
}