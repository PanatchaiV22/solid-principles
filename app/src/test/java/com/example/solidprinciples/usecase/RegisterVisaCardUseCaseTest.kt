package com.example.solidprinciples.usecase

import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.VisaCardService
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class RegisterVisaCardUseCaseTest {

    @DisplayName("Given a user When register Then call visa card service")
    @Test
    fun badTestName() {
        // init
        val user = User("Earth")
        val visaCardService: VisaCardService = mockk(relaxed = true)
        val registerVisaCardUseCase = RegisterVisaCardUseCase(visaCardService)

        // execute
        registerVisaCardUseCase.register(user)

        // verify
        verify { visaCardService.registerVisaCard(user) }
    }
}