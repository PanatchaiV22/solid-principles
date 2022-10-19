package com.example.solidprinciples.service

import com.example.solidprinciples.model.User

interface CreditCardService {
    fun registerCreditCard(user: User)
}