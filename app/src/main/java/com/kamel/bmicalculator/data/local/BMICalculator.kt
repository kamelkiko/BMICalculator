package com.kamel.bmicalculator.data.local

import com.kamel.bmicalculator.data.dto.BmiDto
import com.kamel.bmicalculator.data.dto.BmiStatusDto
import com.kamel.bmicalculator.data.dto.InvalidHeightFormatException
import com.kamel.bmicalculator.data.dto.InvalidWeightFormatException
import javax.inject.Inject

class BMICalculator @Inject constructor() : IBMICalculator {
    override fun calculation(height: Double, weight: Double): BmiDto {
        require(height > MINIMUM_HEIGHT) {
            InvalidHeightFormatException(INVALID_HEIGHT_EXCEPTION_MESSAGE)
        }
        require(weight > MINIMUM_WEIGHT) {
            InvalidWeightFormatException(INVALID_WEIGHT_EXCEPTION_MESSAGE)
        }

        val bmi = weight / (height * height)
        val bodyInfo = getBodyInfoFromBmi(bmi)
        val bodyStatus = getBodyStatusFromBodyInfo(bodyInfo)
        return BmiDto(bmi = bmi, information = bodyInfo, status = bodyStatus)
    }

    private fun getBodyInfoFromBmi(bmi: Double): String {
        return when (bmi) {
            in UNDERWEIGHT_MIN..UNDERWEIGHT_MAX -> UNDERWEIGHT

            in HEALTHY_MIN..HEALTHY_MAX -> HEALTHY

            in OVERWEIGHT_MIN..OVERWEIGHT_MAX -> OVERWEIGHT

            else -> OBESE
        }
    }

    private fun getBodyStatusFromBodyInfo(bodyInfo: String): BmiStatusDto {
        return when (bodyInfo) {
            UNDERWEIGHT -> BmiStatusDto.UNDERWEIGHT
            HEALTHY -> BmiStatusDto.NORMAL
            OVERWEIGHT -> BmiStatusDto.OVERWEIGHT
            OBESE -> BmiStatusDto.OBESE
            else -> BmiStatusDto.OBESE
        }
    }

    companion object {
        private const val UNDERWEIGHT = "Underweight"
        private const val HEALTHY = "Healthy"
        private const val OVERWEIGHT = "Overweight"
        private const val OBESE = "Obese"

        private const val INVALID_HEIGHT_EXCEPTION_MESSAGE = "Height must be bigger than zero"
        private const val INVALID_WEIGHT_EXCEPTION_MESSAGE = "Weight must be bigger than zero"

        private const val MINIMUM_HEIGHT = 0.0
        private const val MINIMUM_WEIGHT = 0.0

        private const val UNDERWEIGHT_MIN = 0.0
        private const val UNDERWEIGHT_MAX = 18.5
        private const val HEALTHY_MIN = 18.5
        private const val HEALTHY_MAX = 24.9
        private const val OVERWEIGHT_MIN = 25.0
        private const val OVERWEIGHT_MAX = 29.9
    }
}