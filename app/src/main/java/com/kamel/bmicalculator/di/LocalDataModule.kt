package com.kamel.bmicalculator.di

import com.kamel.bmicalculator.data.local.BMICalculator
import com.kamel.bmicalculator.data.local.IBMICalculator
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class LocalDataModule {
    @Singleton
    @Binds
    abstract fun bindBmiCalculator(bmiCalculator: BMICalculator): IBMICalculator
}