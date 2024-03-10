package com.kamel.bmicalculator.data.repository

import com.kamel.bmicalculator.domain.model.Bmi

interface IBmiRepository {
    fun getBmi(height: Double, weight: Double): Bmi
}