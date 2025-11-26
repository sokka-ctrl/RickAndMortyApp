package com.example.rickandmortyapp.data.api

import com.example.rickandmortyapp.data.models.BaseResponseDto
import com.example.rickandmortyapp.data.models.CharacterDto
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CartoonApi {

    @GET("character")
    suspend fun getCharacters() : Response<BaseResponseDto>

    @GET("character/{id}")
    suspend fun getCharacterByID(
        @Path("id")
        id: Int) : Response<CharacterDto>
}