package com.example.solidprinciples.usecase

import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.DebitCardService
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class RegisterDebitCardUseCaseTest {

    @DisplayName("Given a user When register Then call the debit card service")
    @Test
    fun badTestName() {
        // init
        val user = User("Earth")
        val debitCardService: DebitCardService = mockk(relaxed = true)
        val registerDebitCardUseCase = RegisterDebitCardUseCase(debitCardService)

        // execute
        registerDebitCardUseCase.register(user)

        // verify
        verify { debitCardService.registerDebitCard(user) }
    }
}