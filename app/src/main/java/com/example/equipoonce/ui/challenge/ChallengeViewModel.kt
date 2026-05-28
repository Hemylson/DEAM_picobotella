package com.example.equipoonce.ui.challenge

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.equipoonce.data.local.RetoEntity
import com.example.equipoonce.data.repository.RetoRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ChallengeViewModel(private val repository: RetoRepository) : ViewModel() {

    private val _retoActual = MutableStateFlow<RetoEntity?>(null)
    val retoActual: StateFlow<RetoEntity?> = _retoActual

    fun obtenerRetoAleatorio() = viewModelScope.launch {
        // TODO: obtener lista de retos y seleccionar uno aleatorio con .random()
        // TODO: opcionalmente obtener imagen de Pokémon de PokemonRepository
    }
}
