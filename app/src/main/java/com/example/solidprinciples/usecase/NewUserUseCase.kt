package com.example.solidprinciples.usecase

import com.example.solidprinciples.analytic.SegmentAnalytic
import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.EmailService
import com.example.solidprinciples.service.RegistrationService
import com.example.solidprinciples.service.UserService

class NewUserUseCase {
    private val registrationService = RegistrationService()
    private val emailService = EmailService()
    private val userService = UserService()
    private val segmentAnalytic = SegmentAnalytic()

    fun registerUser(user: User) {
        registrationService.register(user)
        segmentAnalytic.track("Register user ${user.name}")
    }

    fun sendEmailToUser(user: User) {
        emailService.sendEmailToUser(user)
        segmentAnalytic.track("Email user ${user.name}")
    }

    fun updateUseDetail(user: User) {
        userService.updateUserDetail(user)
        segmentAnalytic.track("Update user ${user.name}")
    }
}