package com.example.solidprinciples.calculator

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class CalculatorTest {

    @DisplayName("Given Addition of 1 + 2 When execute Then return 3")
    @Test
    fun badTestName() {
        // init
        val operation: Calculator.Operation<Int> = Addition(1, 2)
        val calculator = Calculator()

        // execute
        val actual = calculator.calculate(operation)

        // assertions
        assertEquals(3, actual)
    }
}