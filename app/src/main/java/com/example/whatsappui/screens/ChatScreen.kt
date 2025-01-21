package com.example.whatsappui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.whatsappui.data.chatsList
import com.example.whatsappui.domain.ChatListDataObject
import com.example.whatsappui.ui.theme.components.UserDetails
import com.example.whatsappui.ui.theme.components.UserImage



@Composable
fun ChatScreen(openConversation: () -> Unit = {}) {
//    val navController = rememberNavController()
//    var isDialogOpen by remember { mutableStateOf(false) }
//    var selectedUser by remember { mutableStateOf<ChatListDataObject?>(null) }
//    var messageText by remember { mutableStateOf("") }

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
                   // selectedUser = chatsData
                   // isDialogOpen = true
                    openConversation()
                }
            )
        }
    }

//    if (isDialogOpen && selectedUser != null) {
//        MessageDialog(
//            userName = selectedUser!!.userName,
//            messageText = messageText,
//            onMessageChange = { messageText = it },
//            onSend = {
//                // Handle sending the message here if needed
//                isDialogOpen = false
//                messageText = ""
//            },
//            onDismiss = {
//                isDialogOpen = false
//                messageText = ""
//            }
//        )
//    }
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
// replace with navigation
//@Composable
//fun MessageDialog(
//    userName: String,
//    messageText: String,
//    onMessageChange: (String) -> Unit,
//    onSend: () -> Unit,
//    onDismiss: () -> Unit
//) {
//    AlertDialog(
//        onDismissRequest = { onDismiss() },
//        title = { Text(text = "Message $userName") },
//        text = {
//            Column {
//                Text(text = "Type your message:")
//                Spacer(modifier = Modifier.height(8.dp))
//                TextField(
//                    value = messageText,
//                    onValueChange = onMessageChange,
//                    placeholder = { Text("Enter message") }
//                )
//            }
//        },
//        confirmButton = {
//            TextButton(onClick = onSend) {
//                Text("Send")
//            }
//        },
//        dismissButton = {
//            TextButton(onClick = onDismiss) {
//                Text("Cancel")
//            }
//        }
//    )
//}

@Preview(showBackground = true)
@Composable
fun ChatScreenPreview() {
    ChatScreen()
}
