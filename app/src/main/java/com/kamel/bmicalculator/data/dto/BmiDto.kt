package com.kamel.bmicalculator.data.dto

data class BmiDto(
    val bmi:Double,
    val information:String,
    val status:BmiStatusDto,
)
