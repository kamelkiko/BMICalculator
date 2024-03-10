package com.kamel.bmicalculator.domain.model

open class BmiException(message: String?) : Exception(message)

open class BmiValidationException(message: String?) : BmiException(message)

class InvalidHeightException(message: String?) : BmiValidationException(message)

class InvalidWeightException(message: String?) : BmiValidationException(message)