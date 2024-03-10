package com.kamel.bmicalculator.data.dto

open class BmiCalculatorValidationException(message: String?) : Exception(message)

class InvalidHeightFormatException(message: String?) : BmiCalculatorValidationException(message)

class InvalidWeightFormatException(message: String?) : BmiCalculatorValidationException(message)