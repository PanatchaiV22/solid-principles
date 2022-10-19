package com.example.solidprinciples.usecase

import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.SimpleRegisterCardService

class RegisterDebitCardUseCase {
    private val simpleRegisterCardService = SimpleRegisterCardService()

    fun register(user: User) {
        simpleRegisterCardService.registerDebitCard(user)
    }
}