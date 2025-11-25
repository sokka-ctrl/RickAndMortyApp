package com.example.rickandmortyapp.domain.repository

import com.example.rickandmortyapp.core.Either
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {
    fun getCharacters() : Flow<Either<String, List<Character>>>
    fun getCharacterByID(id: Int) : Flow<Either<String, Character>>
}