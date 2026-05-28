package com.example.equipoonce.data.remote

import com.example.equipoonce.data.remote.dto.PokemonDto
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApiService {
    // TODO: agregar endpoints necesarios (lista de pokémon, imagen, etc.)
    @GET("pokemon/{name}")
    suspend fun getPokemon(@Path("name") name: String): PokemonDto
}
