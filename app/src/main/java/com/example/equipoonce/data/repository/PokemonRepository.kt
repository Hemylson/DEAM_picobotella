package com.example.equipoonce.data.repository

import com.example.equipoonce.data.remote.PokemonApiService
import com.example.equipoonce.data.remote.dto.PokemonDto

class PokemonRepository(private val api: PokemonApiService) {
    // TODO: agregar lógica para obtener Pokémon aleatorio para asignar a retos
    suspend fun getPokemon(name: String): PokemonDto = api.getPokemon(name)
}
