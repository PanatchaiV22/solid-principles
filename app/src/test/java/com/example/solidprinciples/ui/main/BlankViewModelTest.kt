package com.example.solidprinciples.ui.main

import androidx.lifecycle.SavedStateHandle
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BlankViewModelTest {

    @Test
    fun testViewModel() {
        // init mocks
        val savedStateHandle = SavedStateHandle(mapOf("name" to "Test User"))

        // initialize view model
        val vm = BlankViewModel(savedStateHandle)

        assertEquals("Test User", vm.args.name)
    }
}