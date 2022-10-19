package com.example.solidprinciples.service

import com.example.solidprinciples.model.User

class MasterCardServiceImpl : MasterCardService {
    override fun registerMasterCard(user: User) {
        println("Registering MasterCard")
    }
}