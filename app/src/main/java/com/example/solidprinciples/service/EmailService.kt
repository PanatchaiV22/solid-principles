package com.example.solidprinciples.service

import com.example.solidprinciples.model.User

class EmailService {
    fun sendEmailToUser(user: User) {
        println("Sending email to ${user.name}")
    }
}