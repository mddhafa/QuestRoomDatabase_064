package com.example.roomlocaldb.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.Insert
import com.example.roomlocaldb.ui.view.Mahasiswa.InsertMhsView

object DestinasiInsert : AlamatNavigasi{
    override val route: String ="insert_mhs"
}

@Composable
fun PegelolaHalaman(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
){
    NavHost(
        navController = navController,
        startDestination = DestinasiInsert.route
    ){
        composable(
            route = DestinasiInsert.route
        ){
            InsertMhsView(
                onBack = {},
                onNavigate = {}
            )
        }
    }
}