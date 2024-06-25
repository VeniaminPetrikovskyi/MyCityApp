package com.example.mycityapp.ui

import com.example.mycityapp.data.Item

data class MyCityUiState(
    val currentSelectedCategory: Item ?= null,
    val currentSelectedRecommendation: Item ?= null,
)