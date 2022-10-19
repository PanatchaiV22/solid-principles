package com.example.solidprinciples.usecase

import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.MasterCardService
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class RegisterMasterCardUseCaseTest {

    @DisplayName("Given a user When register Then call master card service")
    @Test
    fun badTestName() {
        // init
        val user = User("Earth")
        val masterCardService: MasterCardService = mockk(relaxed = true)
        val registerMasterCardUseCase = RegisterMasterCardUseCase(masterCardService)

        // execute
        registerMasterCardUseCase.register(user)

        // verify
        verify { masterCardService.registerMasterCard(user) }
    }
}