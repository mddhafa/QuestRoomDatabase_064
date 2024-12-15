package com.example.roomlocaldb.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.roomlocaldb.data.entity.Mahasiswa
import com.example.roomlocaldb.repository.RepositoryMhs
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.map

class HomeMhsViewModel(
    private val repositoryMhs: RepositoryMhs
):ViewModel(){

    val homeUiState: StateFlow<HomeUiState> = repositoryMhs.getAllMhs()
        .filterNotNull()
        .map {
            HomeUiState(
                listMhs = it.toList(),
                isLoading = false,
            )
        }
}

data class HomeUiState (
    val listMhs: List<Mahasiswa> = listOf(),
    val isLoading: Boolean =false,
    val isError: Boolean = false,
    val errorMessage: String = ""
)