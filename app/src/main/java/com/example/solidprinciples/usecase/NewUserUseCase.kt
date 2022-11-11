package com.example.solidprinciples.usecase

import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.EmailService
import com.example.solidprinciples.service.RegistrationService
import com.example.solidprinciples.service.UserService

class NewUserUseCase {
    private val registrationService = RegistrationService()
    private val emailService = EmailService()
    private val userService = UserService()

    fun registerUser(user: User) {
        registrationService.register(user)
    }

    fun sendEmailToUser(user: User) {
        emailService.sendEmailToUser(user)
    }

    fun updateUseDetail(user: User) {
        userService.updateUserDetail(user)
    }
}