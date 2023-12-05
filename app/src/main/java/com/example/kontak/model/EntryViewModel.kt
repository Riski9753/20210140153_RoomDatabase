package com.example.kontak.model

import android.app.PictureInPictureUiState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class EntryViewModel(private  val repostoriSiswa: RpostoriSiswa): ViewModel(){

    data class UIStateSiswa(
        val detailSiswa: DetailSiswa = DetailSiswa(),
        val isEntryValid: Boolean = false
    )
    data class DetailSiswa(
        val id: Int = 0,
        val nama: String = "",
        val alamat: String = "",
        val telpon: String = "",
    )
}