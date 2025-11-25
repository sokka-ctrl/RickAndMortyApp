package com.example.rickandmortyapp.data.api

import retrofit2.http.GET
import retrofit2.http.Path

interface CartoonApi {

        @GET("character")
        suspend fun getCharacters() : BaseResponseDto

        @GET("character/{id}")
        suspend fun getCharacterByID(
            @Path("id")
            id: Int) : CharacterDto
}