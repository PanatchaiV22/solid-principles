package com.example.solidprinciples.service

import com.example.solidprinciples.model.User

interface WalletService {
    fun registerWallet(user: User)
}