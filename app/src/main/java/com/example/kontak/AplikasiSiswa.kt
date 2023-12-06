package com.example.kontak

import android.app.Application
import com.example.kontak.Repositori.ContainerDataApp

class AplikasiSiswa: Application() {
    lateinit var container: ContainerDataApp

    override fun onCreate(){
        super.onCreate()
        container = ContainerDataApp(this)
    }
}