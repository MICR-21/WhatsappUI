package com.example.whatsappui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.whatsappui.data.chatsList


    @SuppressLint("NotConstructor")
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun ConversationScreen(navController: NavController, chatId: Int) {
        if (chatId != null && chatId > 0){
            val chatData = chatsList.find { it.chatId == chatId}
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { Text(text = chatData?.userName ?: "Unknown User") },
                        navigationIcon = {
                            IconButton(onClick = { navController.popBackStack() }) {
                                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                            }
                        }
                    )
                }
            ){
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(it),
                    contentAlignment = Alignment.Center
                ){

                    Text(text = chatData?.message?.content ?: "No message available")

                }
            }

        }else{
            Text("Invalid chat ID")
        }
    }
    @Preview
    @Composable
    fun ConversationScreenPreview() {
        val samplechatId = chatsList.firstOrNull()?.chatId ?: -1
        val NavController = rememberNavController()
        ConversationScreen(navController = NavController,chatId = samplechatId)
    }