package com.example.solidprinciples.service

import com.example.solidprinciples.model.User

class WalletServiceImpl : WalletService {
    override fun registerWallet(user: User) {
        println("Registering Wallet")
    }
}