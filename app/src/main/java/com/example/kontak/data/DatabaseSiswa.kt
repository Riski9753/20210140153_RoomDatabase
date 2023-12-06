package com.example.kontak.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.internal.synchronized

@Database(entities = [Siswa::class],version =1, exportSchema = false)
abstract class DatabaseSiswa : RoomDatabase() {
    abstract fun SiswaDao() : SiswaDao

    companion object{
        @Volatile
        private var Instance: DatabaseSiswa? = null

        fun getDatabase(context: Context): DatabaseSiswa{
            return (Instance?: kotlin.synchronized(this){
                Room.databaseBuilder(context,
                    DatabaseSiswa::class.java,"siswa_database")
                    .build().also { Instance =it }
            })
        }
    }
}