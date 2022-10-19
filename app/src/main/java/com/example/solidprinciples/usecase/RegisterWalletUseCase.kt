package com.example.solidprinciples.usecase

import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.WalletService

class RegisterWalletUseCase(
    private val walletService: WalletService
) {

    fun register(user: User) {
        walletService.registerWallet(user)
    }
}