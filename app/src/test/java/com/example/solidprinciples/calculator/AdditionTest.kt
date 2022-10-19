package com.example.solidprinciples.calculator

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class AdditionTest {

    @Test
    fun `Given 1 and 2 When invoke() Then return 3`() {
        // init
        val addition: Calculator.Operation<Int> = Addition(1, 2)

        // execute
        val actual = addition()

        // assertions
        assertEquals(3, actual)
    }
}