package com.example.whatsappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.whatsappui.data.Screen
import com.example.whatsappui.screens.ConversationScreen
import com.example.whatsappui.ui.theme.WhatsappUITheme
import com.example.whatsappui.screens.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsappUITheme {
                Surface(modifier = Modifier.fillMaxSize()) {

                    val navController = rememberNavController()

                  NavHost(navController = navController, startDestination = Screen.Home.name){
                      composable(Screen.Home.name){
                          HomeScreen(
                              navController = navController

                          )

                      }
                      composable("conversation/{chatId}"){ backStackEntry ->
                        val chatId = backStackEntry.arguments?.getInt("chatId")
                          ConversationScreen(navController = navController, chatId = chatId ?: -1)

                      }
                  }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WhatsappPreview() {
    WhatsappUITheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            val navController = rememberNavController()
            HomeScreen(navController = navController)
        }
    }
}
