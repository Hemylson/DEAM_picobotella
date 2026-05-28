package com.example.equipoonce.data.remote.dto

import com.google.gson.annotations.SerializedName

data class PokemonDto(
    // TODO: mapear campos completos de la PokeAPI (sprites, tipos, stats, etc.)
    @SerializedName("id") val id: Int = 0,
    @SerializedName("name") val name: String = "",
)
