package com.example.tictacktoe_lt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.tictacktoe_lt.ui.theme.TicTackToeLTTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TicTackToeLTTheme {
                    TicTacToeApp()
                }
            }
        }
    }

@Composable
fun TicTacToeApp(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home"){
        composable("Home") { Home(navController) }
        composable("Lobby") { Lobby(navController) }
        composable("Game") {  Game(navController) }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TicTackToeLTTheme {
        TicTacToeApp()
    }
}
/*
ATT GÖRA
* Snyggare UI för Home,Lobby och Game
* Implementera spellogiken
* FireBase och allt det där krångliga
* skapa övergång mellan lobby och game
* skapa övergång mellan game och lobby när spelet är slut
 */