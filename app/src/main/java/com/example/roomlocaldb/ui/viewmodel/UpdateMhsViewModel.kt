package com.example.roomlocaldb.ui.viewmodel

import com.example.roomlocaldb.data.entity.Mahasiswa


fun Mahasiswa.toUiStateMhs () : MhsUiState = MhsUiState(
    mahasiswaEvent = this.toDetailUiEvent(),
)
