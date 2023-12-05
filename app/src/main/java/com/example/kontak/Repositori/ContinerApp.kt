package com.example.kontak.Repositori

import android.content.Context
import com.example.kontak.data.DatabaseSiswa

interface ContinerApp {
    val repositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context): ContinerApp{
    override val repositoriSiswa: RepositoriSiswa by lazy{
        OfflineRepositoriSiswa(DatabaseSiswa.getDatabase(context).SiswaDao())
    }
}