package com.irv205.gamechallenge.data.repository

import com.irv205.gamechallenge.core.util.ResponseHandler
import com.irv205.gamechallenge.data.mapper.mapGameDTOToGame
import com.irv205.gamechallenge.data.service.ApiService
import com.irv205.gamechallenge.domain.model.Game
import com.irv205.gamechallenge.domain.repository.GameRepository
import javax.inject.Inject

class GameRepositoryImpl @Inject constructor(
    private val service: ApiService,
    //DATA BASE
): GameRepository {

    override suspend fun getGames(): ResponseHandler<List<Game>> {
        return try {
            ResponseHandler.Success(service.getGames().map { mapGameDTOToGame(it) })
        } catch (e: Exception) {
            ResponseHandler.Error(e.message.toString())
        }
    }

}