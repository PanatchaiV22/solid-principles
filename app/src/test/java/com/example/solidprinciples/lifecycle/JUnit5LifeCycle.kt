package com.example.solidprinciples.lifecycle

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class JUnit5LifeCycle {

    @BeforeEach
    fun beforeEach() {
        println("BeforeEach")
    }

    @AfterEach
    fun afterEach() {
        println("AfterEach")
    }

    @Test
    fun test() {
        println("Test")
    }

    companion object {
        @JvmStatic
        @BeforeAll
        fun beforeAll() {
            println("BeforeAll")
        }

        @JvmStatic
        @AfterAll
        fun afterAll() {
            println("AfterAll")
        }
    }
}