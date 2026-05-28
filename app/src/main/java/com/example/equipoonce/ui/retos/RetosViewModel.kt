package com.example.equipoonce.ui.retos

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.equipoonce.data.local.RetoEntity
import com.example.equipoonce.data.repository.RetoRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class RetosViewModel(private val repository: RetoRepository) : ViewModel() {

    // TODO: implementar ViewModelFactory para inyectar RetoRepository
    val retos: StateFlow<List<RetoEntity>> = repository.allRetos
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    fun addReto(reto: RetoEntity) = viewModelScope.launch {
        // TODO: validar que la descripción no esté vacía antes de insertar
        repository.insert(reto)
    }

    fun updateReto(reto: RetoEntity) = viewModelScope.launch {
        repository.update(reto)
    }

    fun deleteReto(reto: RetoEntity) = viewModelScope.launch {
        repository.delete(reto)
    }
}
