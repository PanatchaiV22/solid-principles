package com.example.solidprinciples.usecase

import com.example.solidprinciples.analytic.AnalyticProvider
import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.EmailService

class EmailUseCase(
    private val emailService: EmailService,
    private val analyticProvider: AnalyticProvider
) {
    fun sendEmailToUser(user: User) {
        emailService.sendEmailToUser(user)
        analyticProvider.track("Email user ${user.name}")
    }
}