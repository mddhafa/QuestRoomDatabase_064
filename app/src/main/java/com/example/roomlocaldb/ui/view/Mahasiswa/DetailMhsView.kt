package com.example.roomlocaldb.ui.view.Mahasiswa

import android.app.AlertDialog
import java.nio.file.WatchEvent.Modifier
import androidx.compose.runtime.Composable
import org.w3c.dom.Text


@Composable
private fun DeleteConfirmationDialog (
    onDeleteConfirm: () -> Unit, onDeleteCancel: () -> Unit, modifier: Modifier = Modifier
){
    AlertDialog(onDismissRequest = { /* Do nothing */},
        title = {Text("Delete Data")},
        text = { Text ("Apakah anda yakin ingin menghapus data?")},
        modifier = modifier,
        dismissButton = {
            TextButton(onClick = onDeleteCancel){
                Text(text = "Cancel")
            }
        },
        confirmButton = {
            TextButton(onClick = onDeleteConfirm) {
                Text(text = "Yes")
            }
        }
    )
}
