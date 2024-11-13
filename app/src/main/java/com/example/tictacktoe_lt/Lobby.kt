package com.example.tictacktoe_lt

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.tictacktoe_lt.ui.theme.TicTackToeLTTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter") //tillfälligt för att undvika kompileringsfel
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Lobby(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                //titel för lobby
                title = { Text("Lobby") }
            )
        },
    ){
        //här ska vi ha de två vita boxarna med "Online Players"
        //och "Recieved invites"
    }
}

