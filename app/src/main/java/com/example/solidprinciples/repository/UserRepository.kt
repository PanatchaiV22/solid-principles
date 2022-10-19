package com.example.solidprinciples.repository

import com.example.solidprinciples.model.User

interface UserRepository {
    fun save(user: User)
    fun getUser(id: Int): User
    fun delete(user: User)
}