package com.kamel.bmicalculator.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.kamel.bmicalculator.domain.usecase.GetBmiUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class BmiViewModel @Inject constructor(private val bmiUseCase: GetBmiUseCase) : ViewModel() {
    private val _state = MutableStateFlow(BmiUiState())
    val state = _state.asStateFlow()

    fun getBmi(height: Double, weight: Double) {
        val bmi = bmiUseCase.getBmi(height, weight)
        _state.update {
            it.copy(
                bmiInfoUiState = BmiInfoUiState(
                    bmi = bmi.bmi,
                    bmiInfo = bmi.information,
                )
            )
        }
    }
}