package com.example.solidprinciples.service

import com.example.solidprinciples.model.User

interface DebitCardService {
    fun registerDebitCard(user: User)
}