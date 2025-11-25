package com.example.rickandmortyapp.data.repository

import com.example.rickandmortyapp.core.Either
import com.example.rickandmortyapp.data.api.CartoonApi
import com.example.rickandmortyapp.data.base.BaseRepository
import kotlinx.coroutines.flow.Flow

class CharacterRepositoryImpl(
    private val api: CartoonApi
) : CharacterRepository, BaseRepository() {

    override fun getCharacters() : Flow<Either<String, List<Character>>> {
        return doRequest2 {
            api.getCharacters().characters.toDomain()
        }
    }

    override fun getCharacterByID(id: Int) : Flow<Either<String, Character>> {
        return doRequest2 {
            api.getCharacterByID(id).toDomain()
        }
    }
}