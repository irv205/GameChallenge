package com.irv205.gamechallenge.domain.repository

import com.irv205.gamechallenge.core.util.ResponseHandler
import com.irv205.gamechallenge.domain.model.Game

interface GameRepository {
    suspend fun getGames(): ResponseHandler<List<Game>>
}