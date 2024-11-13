package com.example.tictacktoe_lt

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter") //tillfälligt
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Game(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Home") }
            )
        },
    ){
        //här ska spelbrädet och allt annat skit implementeras
    }
}

