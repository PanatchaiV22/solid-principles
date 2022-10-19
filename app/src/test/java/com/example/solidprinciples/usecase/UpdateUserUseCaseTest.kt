package com.example.solidprinciples.usecase

import com.example.solidprinciples.analytic.AnalyticProvider
import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.UserService
import io.mockk.justRun
import io.mockk.mockk
import io.mockk.slot
import io.mockk.verify
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class UpdateUserUseCaseTest {

    @Test
    fun `GivenUser WhenUpdateUserDetail ThenUserServiceIsCalled`() {
        // init mocks
        val userService = mockk<UserService>()
        val analyticProvider = mockk<AnalyticProvider>()
        val user = User("Earth")
        val updateUserUseCase = UpdateUserUseCase(userService, analyticProvider)
        val analyticSlot = slot<Any>()

        justRun { updateUserUseCase.updateUseDetail(any()) }
        justRun { analyticProvider.track(any()) }

        // execute test
        updateUserUseCase.updateUseDetail(user)

        // verify
        verify { userService.updateUserDetail(user) }
        verify { analyticProvider.track(capture(analyticSlot)) }

        // assertions
        assertEquals("Update user ${user.name}", analyticSlot.captured)
    }
}