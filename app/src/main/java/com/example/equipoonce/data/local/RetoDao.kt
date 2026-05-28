package com.example.equipoonce.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface RetoDao {
    @Query("SELECT * FROM retos")
    fun getAllRetos(): Flow<List<RetoEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertReto(reto: RetoEntity)

    @Update
    suspend fun updateReto(reto: RetoEntity)

    @Delete
    suspend fun deleteReto(reto: RetoEntity)
}
