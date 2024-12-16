package com.example.roomlocaldb.ui.navigation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.roomlocaldb.ui.view.mahasiswa.DestinasiInsert
import com.example.roomlocaldb.ui.view.mahasiswa.DetailMhsView
import com.example.roomlocaldb.ui.view.mahasiswa.HomeMhsView
import com.example.roomlocaldb.ui.view.mahasiswa.InsertMhsView
import com.example.roomlocaldb.ui.view.mahasiswa.UpdateMhsView


@Composable
fun PengelolaHalaman(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
) {
    NavHost(
        navController = navController,
        startDestination = AlamatNavigasi.DestinasiHome.route
    ) {
        composable(
            route = AlamatNavigasi.DestinasiHome.route
        ) {
            HomeMhsView(
                onDetailClick = { nim ->
                    navController.navigate("${AlamatNavigasi.DestinasiDetail.route}/$nim")
                    println("PengelolaHalaman: nim = $nim")
                },
                onAddMhs = {
                    navController.navigate(DestinasiInsert.route)
                },
                modifier = Modifier
            )
        }

    }
}