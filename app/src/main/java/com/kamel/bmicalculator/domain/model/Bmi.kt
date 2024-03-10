package com.kamel.bmicalculator.domain.model

data class Bmi(
    val bmi: Double,
    val information: String,
    val status: BmiStatus,
)
