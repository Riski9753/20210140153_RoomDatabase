package com.example.kontak.Repositori

import com.example.kontak.data.Siswa
import com.example.kontak.data.SiswaDao
import kotlinx.coroutines.flow.Flow

class OfflineRepositoriSiswa(private val siswaDao: SiswaDao):RepositoriSiswa {
    override fun getAllSiswaStream(): Flow<List<Siswa>> =siswaDao.getAllSiswa()
    override fun getAllSiswaStream(id: Int): Flow<List<Siswa?>> = siswaDao.getSiswa(id)
    override suspend fun insertSiswa(siswa: Siswa) = siswaDao.insert(siswa)
    override suspend fun deleteSiswa(siswa: Siswa) = siswaDao.delete(siswa)
    override suspend fun updateSiswa(siswa: Siswa) = siswaDao.updata(siswa)
}