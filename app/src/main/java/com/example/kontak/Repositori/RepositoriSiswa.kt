package com.example.kontak.Repositori

import com.example.kontak.data.Siswa
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    fun getAllSiswaStream(id: Int): Flow<List<Siswa?>>

    suspend fun insertSiswa(siswa: Siswa)
    suspend fun deleteSiswa(siswa: Siswa)
    suspend fun updateSiswa(siswa: Siswa)
}