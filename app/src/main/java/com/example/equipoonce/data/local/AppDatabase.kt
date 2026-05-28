package com.example.equipoonce.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.equipoonce.utils.Constants

@Database(entities = [RetoEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun retoDao(): RetoDao

    companion object {
        @Volatile private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            // TODO: migrar a inyección de dependencias (Hilt/Koin) cuando escale
            return INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    Constants.DATABASE_NAME
                ).build().also { INSTANCE = it }
            }
        }
    }
}
