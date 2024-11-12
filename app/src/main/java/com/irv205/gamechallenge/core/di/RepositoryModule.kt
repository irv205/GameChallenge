package com.irv205.gamechallenge.core.di

import com.irv205.gamechallenge.data.repository.GameRepositoryImpl
import com.irv205.gamechallenge.domain.repository.GameRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun provideRepository(repositoryImpl: GameRepositoryImpl): GameRepository
}