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
import com.example.whatsappui.data.statusList
import com.example.whatsappui.domain.StatusDataObject
import com.example.whatsappui.ui.theme.components.UserImage  // Assuming UserImage component exists

@Composable
fun StatusScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top
    ) {
        items(statusList) { statusData ->
            StatusListItem(statusData)
        }
    }
}

@Composable
fun StatusListItem(statusData: StatusDataObject) {
    Row(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        UserImage(statusData.userImage)
        Column(
            modifier = Modifier.padding(start = 16.dp)
        ) {
            Text(text = statusData.userName)
            Text(text = statusData.statusTime)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StatusScreenPreview() {
    StatusScreen()
}
