package com.example.rickandmortyapp.domain.usescases

import com.example.rickandmortyapp.core.Either
import com.example.rickandmortyapp.domain.repository.CharacterRepository
import kotlinx.coroutines.flow.Flow

class GetCharacterUseCase(
    private val repository: CharacterRepository
) {
    fun getCharacters(): Flow<Either<String, List<Character>>> = repository.getCharacters()
}