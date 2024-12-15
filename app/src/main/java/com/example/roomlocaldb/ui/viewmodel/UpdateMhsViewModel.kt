package com.example.roomlocaldb.ui.viewmodel

import androidx.lifecycle.createSavedStateHandle
import com.example.roomlocaldb.KrsApp
import com.example.roomlocaldb.data.entity.Mahasiswa


fun Mahasiswa.toUiStateMhs () : MhsUiState = MhsUiState(
    mahasiswaEvent = this.toDetailUiEvent(),
)

initializer {
    HomeMhsViewModel(
        KrsApp() .containerApp.repositoryMhs,
    )
}

initializer {
    DetailMhsViewModel(
        createSavedStateHandle(),
        KrsApp().containerApp.repositoryMhs,
    )
}

initializer {
    UpdateMhsViewModel (
        createSavedStateHandle(),
        KrsApp().containerApp.repositoryMhs,
    )
}