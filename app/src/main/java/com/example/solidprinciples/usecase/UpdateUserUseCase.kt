package com.example.solidprinciples.usecase

import com.example.solidprinciples.analytic.AnalyticProvider
import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.UserService

class UpdateUserUseCase(
    private val userService: UserService,
    private val analyticProvider: AnalyticProvider
) {
    fun updateUseDetail(user: User) {
        userService.updateUserDetail(user)
        analyticProvider.track("Update user ${user.name}")
    }
}