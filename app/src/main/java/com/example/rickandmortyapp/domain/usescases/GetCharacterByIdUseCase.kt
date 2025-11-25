package com.example.rickandmortyapp.domain.usescases

import com.example.rickandmortyapp.core.Either
import com.example.rickandmortyapp.domain.repository.CharacterRepository
import kotlinx.coroutines.flow.Flow

class GetCharacterByIdUseCase(
    private val repository: CharacterRepository
) {
    operator fun invoke(id: Int): Flow<Either<String, Character>> = repository.getCharacterByID(id)
}
