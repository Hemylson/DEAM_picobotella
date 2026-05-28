package com.example.equipoonce.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "retos")
data class RetoEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    // TODO: agregar campos del reto (descripcion, tipo, nivel, etc.)
)
