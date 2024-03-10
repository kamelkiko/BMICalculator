package com.kamel.bmicalculator.data.mapper

import com.kamel.bmicalculator.data.dto.BmiDto
import com.kamel.bmicalculator.data.dto.BmiStatusDto
import com.kamel.bmicalculator.domain.model.Bmi
import com.kamel.bmicalculator.domain.model.BmiStatus

fun BmiDto.toEntity(): Bmi = Bmi(
    bmi = bmi,
    information = information,
    status = status.toEntity(),
)

private fun BmiStatusDto.toEntity(): BmiStatus {
    return when (this) {
        BmiStatusDto.NORMAL -> BmiStatus.NORMAL
        BmiStatusDto.UNDERWEIGHT -> BmiStatus.UNDERWEIGHT
        BmiStatusDto.OVERWEIGHT -> BmiStatus.OVERWEIGHT
        BmiStatusDto.OBESE -> BmiStatus.OBESE
    }
}