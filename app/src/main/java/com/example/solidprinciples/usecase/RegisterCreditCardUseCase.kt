package com.example.solidprinciples.usecase

import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.SimpleRegisterCardService

class RegisterCreditCardUseCase {
    private val simpleRegisterCardService = SimpleRegisterCardService()

    fun register(user: User) {
        simpleRegisterCardService.registerCreditCard(user)
    }
}