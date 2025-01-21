package com.example.whatsappui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsappui.data.callsList
import com.example.whatsappui.domain.CallDataObject
import com.example.whatsappui.ui.theme.components.UserImage  // Assume you have a UserImage component

@Composable
fun CallsScreen(openCall: () -> Unit = {}) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top
    ) {
        items(callsList) { callData ->
            CallListItem(callData)
        }
    }
}

@Composable
fun CallListItem(callData: CallDataObject) {
    Row(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        UserImage(callData.userImage)
        Column(
            modifier = Modifier.padding(start = 16.dp)
        ) {
            Text(text = callData.userName)
            Text(text = "${callData.callType} • ${callData.callTime}")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CallsScreenPreview() {
    CallsScreen()
}
