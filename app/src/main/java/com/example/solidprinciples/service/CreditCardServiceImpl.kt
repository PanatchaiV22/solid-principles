package com.example.solidprinciples.service

import com.example.solidprinciples.model.User

class CreditCardServiceImpl : CreditCardService {
    override fun registerCreditCard(user: User) {
        println("Registering CreditCard")
    }
}