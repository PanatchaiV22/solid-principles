package com.example.solidprinciples.usecase

import com.example.solidprinciples.analytic.AnalyticProvider
import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.RegistrationService

class RegistrationUseCase(
    private val registrationService: RegistrationService,
    private val analyticProvider: AnalyticProvider
) {
    fun registerUser(user: User) {
        registrationService.register(user)
        analyticProvider.track("Register user ${user.name}")
    }
}