package com.kamel.bmicalculator.di

import com.kamel.bmicalculator.data.repository.BmiRepository
import com.kamel.bmicalculator.data.repository.IBmiRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Singleton
    @Binds
    abstract fun bindBmiRepository(bmiRepository: BmiRepository): IBmiRepository
}