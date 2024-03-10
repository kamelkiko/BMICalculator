package com.kamel.bmicalculator.domain.usecase

import com.kamel.bmicalculator.data.repository.IBmiRepository
import javax.inject.Inject

class GetBmiUseCase @Inject constructor(private val bmiRepository: IBmiRepository) {
    fun getBmi(height: Double, weight: Double) = bmiRepository.getBmi(height, weight)
}