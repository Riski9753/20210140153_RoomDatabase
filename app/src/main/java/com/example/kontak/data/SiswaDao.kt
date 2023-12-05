package com.example.kontak.data

import androidx.room.Delete
import androidx.room.Insert
import kotlinx.coroutines.flow.Flow

interface SiswaDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)

    @Updata
    suspend fun updata(siswa: Siswa)

    @Delete
    suspend fun delete(siswa: Siswa)

    @Quary("SELECT * from tblSiswa WHERE id = :id")
    fun getSiswa(id: Int): Flow<Siswa>

}