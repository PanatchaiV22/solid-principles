package com.example.solidprinciples.usecase

import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.CreditCardService

class RegisterCreditCardUseCase(
    private val creditCardService: CreditCardService
) {
    fun register(user: User) {
        creditCardService.registerCreditCard(user)
    }
}