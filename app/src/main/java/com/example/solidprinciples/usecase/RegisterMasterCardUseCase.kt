package com.example.solidprinciples.usecase

import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.MasterCardService

class RegisterMasterCardUseCase(
    private val masterCardService: MasterCardService
) {

    fun register(user: User) {
        masterCardService.registerMasterCard(user)
    }
}