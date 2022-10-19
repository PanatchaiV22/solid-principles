package com.example.solidprinciples.service

import com.example.solidprinciples.model.User

class UserService {
    fun updateUserDetail(user: User) {
        println("Updating user detail ${user.name}")
    }
}