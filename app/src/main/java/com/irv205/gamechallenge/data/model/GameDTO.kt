package com.irv205.gamechallenge.data.model

import com.google.gson.annotations.SerializedName

data class GameDTO(
    val id: Int,
    val title: String,
    val thumbnail: String,
    @SerializedName("short_description")
    val shortDescription: String,
    @SerializedName("game_url")
    val gameUrl: String,
    val genre: String,
    val platform: String,
    val publisher: String,
    val developer: String,
    @SerializedName("release_date")
    val releaseDate: String,
    @SerializedName("freetogame_profile_url")
    val freeToGameProfileUrl: String
)