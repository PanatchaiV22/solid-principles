package com.example.solidprinciples.usecase

import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.CreditCardService
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class RegisterCreditCardUseCaseTest {

    @DisplayName("Given a user When register Then call credit card register service")
    @Test
    fun badTestName() {
        // init
        val user = User("Earth")
        val creditCardService: CreditCardService = mockk(relaxed = true)
        val registerCreditCardUseCase = RegisterCreditCardUseCase(creditCardService)

        // execute
        registerCreditCardUseCase.register(user)

        // verify
        verify { creditCardService.registerCreditCard(user) }
    }
}