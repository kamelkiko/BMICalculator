package com.kamel.bmicalculator.data.repository

import com.kamel.bmicalculator.data.dto.InvalidHeightFormatException
import com.kamel.bmicalculator.data.dto.InvalidWeightFormatException
import com.kamel.bmicalculator.data.local.IBMICalculator
import com.kamel.bmicalculator.data.mapper.toEntity
import com.kamel.bmicalculator.domain.model.Bmi
import com.kamel.bmicalculator.domain.model.InvalidHeightException
import com.kamel.bmicalculator.domain.model.InvalidWeightException
import javax.inject.Inject

class BmiRepository @Inject constructor(private val bmiCalculator: IBMICalculator) :
    IBmiRepository {
    override fun getBmi(height: Double, weight: Double): Bmi {
        return try {
            bmiCalculator.calculation(height, weight).toEntity()
        } catch (e: InvalidHeightFormatException) {
            throw InvalidHeightException(e.message)
        } catch (e: InvalidWeightFormatException) {
            throw InvalidWeightException(e.message)
        }
    }
}