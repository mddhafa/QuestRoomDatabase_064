package com.example.roomlocaldb

import android.app.Application
import com.example.roomlocaldb.dependeciesinjection.ContainerApp
import com.example.roomlocaldb.dependeciesinjection.InterfaceContainerApp

class KrsApp : Application() {
    //Fungsinua untuk menyoimpan instance ContinerApp
    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()
        //Membuat instance ContainerApp
        containerApp = ContainerApp(this)
        //instance adalah object uang dibuat dari class
    }
}