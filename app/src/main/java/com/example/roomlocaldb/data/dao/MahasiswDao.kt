package com.example.roomlocaldb.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.roomlocaldb.data.entity.Mahasiswa

@Dao
interface MahasiswDao {
    @Insert
    suspend fun inseetMahasiswa(
        mahasiswa: Mahasiswa
    )
}