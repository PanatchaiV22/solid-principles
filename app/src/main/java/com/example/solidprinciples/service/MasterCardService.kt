package com.example.solidprinciples.service

import com.example.solidprinciples.model.User

interface MasterCardService {
    fun registerMasterCard(user: User)
}