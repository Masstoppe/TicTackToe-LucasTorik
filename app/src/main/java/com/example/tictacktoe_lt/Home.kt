package com.example.tictacktoe_lt


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                // enkel titel längst upp på skärmen
                title = { Text("Home") }
            )
        },
    ){ padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            //placerar en enkel play knapp i mitten av skärmen
            Button(onClick = {navController.navigate("Lobby")}) {
                Text("PLAY")
            }
        }
    }
}

