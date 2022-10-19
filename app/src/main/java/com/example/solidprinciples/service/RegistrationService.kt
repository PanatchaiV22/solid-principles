package com.example.solidprinciples.service

import com.example.solidprinciples.model.User

class RegistrationService {
    fun register(user: User) {
        println("Registering ${user.name}")
    }
}