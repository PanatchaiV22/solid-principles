package com.example.solidprinciples.ui.main

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.StateFlow

class BlankViewModel(
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    val args = BlankFragmentArgs.fromSavedStateHandle(savedStateHandle)

    val nameData: StateFlow<String> =
        savedStateHandle.getStateFlow("name", "Nobody")

    fun setName(name: String) {
        savedStateHandle["name"] = name
    }
}