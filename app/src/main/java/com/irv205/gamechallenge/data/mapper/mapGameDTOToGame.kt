package com.irv205.gamechallenge.data.mapper

import com.irv205.gamechallenge.data.model.GameDTO
import com.irv205.gamechallenge.domain.model.Game

fun mapGameDTOToGame(gameDTO: GameDTO): Game {
    return Game(
        id = gameDTO.id,
        title = gameDTO.title,
        thumbnail = gameDTO.thumbnail,
        shortDescription = gameDTO.shortDescription,
        gameUrl = gameDTO.gameUrl,
        genre = gameDTO.genre,
        platform = gameDTO.platform,
        publisher = gameDTO.publisher,
        developer = gameDTO.developer,
        releaseDate = gameDTO.releaseDate,
        freeToGameProfileUrl = gameDTO.freeToGameProfileUrl
    )
}