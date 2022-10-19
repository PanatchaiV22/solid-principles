package com.example.solidprinciples.usecase

import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.SimpleRegisterCardService

class RegisterVisaCardUseCase {
    private val simpleRegisterCardService = SimpleRegisterCardService()

    fun register(user: User) {
        simpleRegisterCardService.registerVisaCard(user)
    }
}