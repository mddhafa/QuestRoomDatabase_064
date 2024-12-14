package com.example.roomlocaldb.repository

import com.example.roomlocaldb.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)

    fun getAllMhs () : Flow<List<Mahasiswa>>

}

