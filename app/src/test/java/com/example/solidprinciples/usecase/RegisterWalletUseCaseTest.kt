package com.example.solidprinciples.usecase

import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.WalletService
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class RegisterWalletUseCaseTest {

    @DisplayName("Given a user When register Then call wallet service")
    @Test
    fun badTestName() {
        // init
        val user = User("Earth")
        val walletService: WalletService = mockk(relaxed = true)
        val registerWalletUseCase = RegisterWalletUseCase(walletService)

        // execute
        registerWalletUseCase.register(user)

        // verify
        verify { walletService.registerWallet(user) }
    }
}