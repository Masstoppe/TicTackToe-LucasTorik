package com.example.tictacktoe_lt

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tictacktoe_lt.ui.theme.TicTackToeLTTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter") //tillfälligt för att undvika kompileringsfel
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Lobby(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.DarkGray,
                    titleContentColor = Color.White
                ),
                //titel för lobby
                title = { Text("Lobby", style = TextStyle(fontSize = 52.sp))}
            )
        },
        bottomBar = {BottomAppBar(containerColor = Color.DarkGray){}}
    ){ padding ->
        Column(
            modifier = Modifier.fillMaxSize().background(color = Color.DarkGray)
        ) {
            //fuckade än så länge
            Box(
                modifier = Modifier.padding(20.dp)
                    .background(color = Color.LightGray)
            ){
                Text("gong gang")
            }
            Spacer(modifier = Modifier.height(12.dp))
            Box(
                modifier = Modifier.padding(20.dp)
                    .background(color = Color.LightGray)
            )
            {
                Text("gong gang")
            }
        }
    }
}

