package com.example.rickandmortyapp.di

import org.koin.dsl.module

val domainModule = module {
    single { GetCharacterUseCase(repository = get()) }

    single { GetCharacterByIdUseCase(repository = get()) }
}