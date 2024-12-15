package com.example.roomlocaldb.repository

import com.example.roomlocaldb.data.dao.MahasiswDao
import com.example.roomlocaldb.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

class LocalRepositoryMhs (
    private val mahasiswDao: MahasiswDao
) : RepositoryMhs{
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswDao.insertMahasiswa(mahasiswa)
    }

   override fun getAllMhs () : Flow<List<Mahasiswa>>{
        return mahasiswDao.getAllMahasiswa()
   }

    override fun getMhs (nim: String) : Flow<Mahasiswa>{
        return mahasiswDao.getMahasiswa(nim)
    }

    override suspend fun deleteMhs (mahasiswa: Mahasiswa){
        mahasiswDao.deleteMahasiswa(mahasiswa)
    }

}


