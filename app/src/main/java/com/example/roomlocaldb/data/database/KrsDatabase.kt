package com.example.roomlocaldb.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.roomlocaldb.data.dao.MahasiswDao
import com.example.roomlocaldb.data.entity.Mahasiswa



@Database(entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract class  KrsDatabase : RoomDatabase(){

    abstract fun mahasiswaDao(): MahasiswDao

    companion object {
        @Volatile
        private var Instance: KrsDatabase? = null

        fun getDatabase(context: Context): KrsDatabase{
            return (Instance ?: synchronized(this){
                Room.databaseBuilder(
                    context,
                    KrsDatabase::class.java,
                    "KrsDatabase"
                )
                    .build().also { Instance = it}
            })
        }
    }
}