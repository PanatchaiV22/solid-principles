package com.example.solidprinciples.usecase

import org.junit.jupiter.api.Test

/**
 * Please use [RegistrationUseCaseTest], [EmailUseCaseTest], and [UpdateUserUseCaseTest] instead.
 */
@Deprecated("Violate Single Responsibility, Dependency Inversion")
internal class NewUserUseCaseTest {

    @Test
    fun `GivenUser WhenRegister ThenCallServiceToRegisterUser`() {
        //TODO: check if the registration service is called
    }

    @Test
    fun `GivenUser WhenSendEmailToUser ThenEmailIsSent`() {
        //TODO: check if the email service is called
    }

    @Test
    fun `GivenUser WhenUpdateUserDetail ThenUserServiceIsCalled`() {
        //TODO: check if the update user service is called
    }
}