package com.example.mycityapp.ui

import androidx.lifecycle.ViewModel
import com.example.mycityapp.data.Item
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update


class MyCityViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(MyCityUiState())
    val uiState: StateFlow<MyCityUiState> = _uiState

    init {
        initializeUIState()
    }

    private fun initializeUIState() {
        _uiState.value =
            MyCityUiState()
    }

    fun selectCategory(category: Item) {
        _uiState.update {
            it.copy(
                currentSelectedCategory = category,
            )
        }
    }

    fun selectRecommendation(recommendation: Item) {
        _uiState.update {
            it.copy(
                currentSelectedRecommendation = recommendation,
            )
        }
    }

    fun backHome() {
        _uiState.update {
            it.copy(
                currentSelectedCategory = null,
                currentSelectedRecommendation = null
            )
        }
    }
}