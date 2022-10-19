package com.example.solidprinciples.usecase

import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.DebitCardService

class RegisterDebitCardUseCase(
    private val debitCardService: DebitCardService
) {

    fun register(user: User) {
        debitCardService.registerDebitCard(user)
    }
}