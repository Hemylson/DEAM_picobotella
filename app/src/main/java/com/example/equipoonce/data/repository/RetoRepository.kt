package com.example.equipoonce.data.repository

import com.example.equipoonce.data.local.RetoDao
import com.example.equipoonce.data.local.RetoEntity
import kotlinx.coroutines.flow.Flow

class RetoRepository(private val retoDao: RetoDao) {
    val allRetos: Flow<List<RetoEntity>> = retoDao.getAllRetos()

    suspend fun insert(reto: RetoEntity) = retoDao.insertReto(reto)
    suspend fun update(reto: RetoEntity) = retoDao.updateReto(reto)
    suspend fun delete(reto: RetoEntity) = retoDao.deleteReto(reto)
}
