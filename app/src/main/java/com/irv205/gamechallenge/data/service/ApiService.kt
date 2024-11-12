package com.irv205.gamechallenge.data.service

import com.irv205.gamechallenge.data.model.GameDTO
import retrofit2.http.GET

interface ApiService {

    @GET("games")
    suspend fun getGames(): List<GameDTO>
}