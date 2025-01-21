package com.example.whatsappui.ui.theme.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappui.domain.ChatListDataObject
import com.example.whatsappui.domain.Message
import com.example.whatsappui.domain.MessageDeliveryStatus
import com.example.whatsappui.domain.MessageType
import com.example.whatsappui.ui.theme.HighlightGreen

@Composable
fun UserDetails(chatsData: ChatListDataObject) {
    Column(
        modifier = Modifier
            .padding(start = 16.dp)
            .wrapContentHeight(),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center

    ) {
        MessageHeader(chatsData)
        MessageSubSection(chatsData)

    }

}

@Composable
fun MessageSubSection(chatsData: ChatListDataObject) {
    Row(
        verticalAlignment = Alignment.CenterVertically

        ) {
        TextComponent(
            value = chatsData.message.content,
            fontSize = 16.sp,
            color = Color.Gray,
            modifier = Modifier.weight(1f)
        )
        chatsData.message.unreadCount?.also {
            CircularCount(
                unreadCount = it.toString(),
                backgroundColor = HighlightGreen,
                textColor = Color.White
            )
        }


    }


}

@Composable
fun MessageHeader(chatsData: ChatListDataObject) {
    Row(
        verticalAlignment = Alignment.CenterVertically,

    ) {
        TextComponent(
            value = chatsData.userName,
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier.weight(1f),
            fontWeight = FontWeight.Bold
        )
        TextComponent(
            value = chatsData.message.timeStamp,
            fontSize = 12.sp,
            color = if((chatsData.message.unreadCount?:0) > 0) HighlightGreen else Color.Gray,
            modifier = null,
            fontWeight = FontWeight.Bold
        )

    }

    }

@Preview
@Composable
fun UserDetailsPreview(showBackground: Boolean = true)
{
    UserDetails(chatsData =
    ChatListDataObject(
        chatId = 1,
        message = Message(
            content = "Good Morning",
            timeStamp = "27/11/2024",
            type= MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Charles Maina",

        )
    )
}

@Preview
@Composable
fun MessageSubSectionPreview(showBackground: Boolean= true) {
    MessageSubSection(ChatListDataObject(
        chatId = 1,
        message = Message(
            content = "Good Morning",
            timeStamp = "27/11/2024",
            type= MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Charles Maina",

        )
    )
}

@Preview
@Composable
fun MessageHeaderPreview(showBackground: Boolean= true) {
    MessageHeader(ChatListDataObject(
        chatId = 1,
        message = Message(
            content = "Good Morning",
            timeStamp = "27/11/2024",
            type= MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Charles Maina",

        )
    )
}