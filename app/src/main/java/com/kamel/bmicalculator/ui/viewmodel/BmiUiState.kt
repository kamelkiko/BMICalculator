package com.kamel.bmicalculator.ui.viewmodel

data class BmiUiState(
    val loading: Boolean = false,
    val error: String? = null,
    val bmiInfoUiState: BmiInfoUiState = BmiInfoUiState(),
)

data class BmiInfoUiState(
    val bmi: Double = 0.0,
    val bmiInfo: String = "",
)
