package com.example.solidprinciples.service

import com.example.solidprinciples.model.User

interface RegisterCardService {
    fun registerCreditCard(user: User)
    fun registerDebitCard(user: User)
    fun registerWallet(user: User)
    fun registerVisaCard(user: User)
    fun registerMasterCard(user: User)
}