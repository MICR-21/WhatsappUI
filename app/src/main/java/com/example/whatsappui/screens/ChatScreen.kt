package com.example.whatsappui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.whatsappui.data.chatsList
import com.example.whatsappui.domain.ChatListDataObject
import com.example.whatsappui.ui.theme.components.UserDetails
import com.example.whatsappui.ui.theme.components.UserImage



@Composable
fun ChatScreen(navController: NavController)
{
    LazyColumn(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.Start
    ) {
        item {
            Spacer(modifier = Modifier.height(10.dp))
        }
        items(chatsList) { chatsData ->
            ChatListItems(
                chatsData = chatsData,
                onClick = {
                    navController.navigate("conversation/${chatsData.chatId}")
                }
            )
        }
    }


}

@Composable
fun ChatListItems(chatsData: ChatListDataObject, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth()
            .clickable { onClick() },
        verticalAlignment = Alignment.CenterVertically
    ) {
        UserImage(chatsData.userImage)
        UserDetails(chatsData)
    }
}

@Preview(showBackground = true)
@Composable
fun ChatScreenPreview() {
    val navController = rememberNavController()
    ChatScreen(navController)
}
