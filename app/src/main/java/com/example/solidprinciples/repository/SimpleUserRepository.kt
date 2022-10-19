package com.example.solidprinciples.repository

import com.example.solidprinciples.model.User

class SimpleUserRepository : UserRepository {
    override fun save(user: User) {
        println("Saving ${user.name}")
    }

    override fun getUser(id: Int): User {
        val user = User("JUnit5")
        println("Returning ${user.name}")
        return user
    }

    override fun delete(user: User) {
        println("Deleting ${user.name}")
    }
}