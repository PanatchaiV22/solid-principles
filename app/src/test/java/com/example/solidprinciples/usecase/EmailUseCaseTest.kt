package com.example.solidprinciples.usecase

import com.example.solidprinciples.analytic.AnalyticProvider
import com.example.solidprinciples.model.User
import com.example.solidprinciples.service.EmailService
import io.mockk.justRun
import io.mockk.mockk
import io.mockk.slot
import io.mockk.verify
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class EmailUseCaseTest {

    @Test
    fun `GivenUser WhenSendEmailToUser ThenEmailService is called`() {
        // init mocks
        val emailService = mockk<EmailService>()
        val analyticProvider = mockk<AnalyticProvider>()
        val user = User("Earth")
        val emailUseCase = EmailUseCase(emailService, analyticProvider)
        val analyticSlot = slot<Any>()

        justRun { emailService.sendEmailToUser(any()) }
        justRun { analyticProvider.track(any()) }

        // execute test
        emailUseCase.sendEmailToUser(user)

        // verify
        verify { emailService.sendEmailToUser(user) }
        verify { analyticProvider.track(capture(analyticSlot)) }

        // assertions
        assertEquals("Email user ${user.name}", analyticSlot.captured)
    }
}