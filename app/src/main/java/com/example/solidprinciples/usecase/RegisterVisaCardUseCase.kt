package com.example.solidprinciples.usecase

import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.VisaCardService

class RegisterVisaCardUseCase(
    private val visaCardService: VisaCardService
) {

    fun register(user: User) {
        visaCardService.registerVisaCard(user)
    }
}