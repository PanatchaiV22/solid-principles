package com.example.solidprinciples.usecase

import com.example.solidprinciples.analytic.AnalyticProvider
import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.RegistrationService
import io.mockk.justRun
import io.mockk.mockk
import io.mockk.slot
import io.mockk.verify
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RegistrationUseCaseTest {

    @Test
    fun `GivenUser WhenRegister ThenCallServiceToRegisterUser`() {
        // init mocks
        val registrationService = mockk<RegistrationService>()
        val segmentAnalytic = mockk<AnalyticProvider>()
        val user = User("Earth")
        val registrationUseCase = RegistrationUseCase(registrationService, segmentAnalytic)
        val analyticSlot = slot<Any>()

        justRun { registrationService.register(any()) }
        justRun { segmentAnalytic.track(any()) }

        // execute test
        registrationUseCase.registerUser(user)

        // verify
        verify { registrationService.register(user) }
        verify { segmentAnalytic.track(capture(analyticSlot)) }

        // assertions
        assertEquals("Register user ${user.name}", analyticSlot.captured)
    }
}