package com.example.roomlocaldb.repository

import com.example.roomlocaldb.data.dao.MahasiswDao
import com.example.roomlocaldb.data.entity.Mahasiswa

class LocalRepositoryMhs (
    private val mahasiswDao: MahasiswDao
) : RepositoryMhs{
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswDao.inseetMahasiswa(mahasiswa)
    }
}