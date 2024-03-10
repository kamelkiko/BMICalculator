package com.kamel.bmicalculator.data.local

import com.kamel.bmicalculator.data.dto.BmiDto

interface IBMICalculator {
    fun calculation(height: Double, weight: Double): BmiDto
}