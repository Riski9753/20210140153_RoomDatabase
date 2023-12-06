package com.example.kontak.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kontak.Repositori.RepositoriSiswa
import com.example.kontak.data.Siswa
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

class HomeViewModel(private val repositorSiswa: RepositoriSiswa): ViewModel(){
    companion object{
        private const val TIMEOUT_MILLIS = 5_000L
    }
    val homeUiState: StateFlow<HomeUiState> = repositorSiswa.getAllSiswaStream()
        .filterNotNull()
        .map { HomeUiState(listSiswa = it.toList()) }
        .stateIn(scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(TIMEOUT_MILLIS),
            initialValue = HomeUiState())
    data class HomeUiState(
        val listSiswa: List<Siswa> = listOf()
    )
}