package com.example.rickandmortyapp.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel {
        CharacterViewModel (
            getCharacterUseCase = get()
        )
    }

    viewModel {
        DetailCharacterViewModel(
            getCharacterByIdUseCase = get()
        )
    }
}