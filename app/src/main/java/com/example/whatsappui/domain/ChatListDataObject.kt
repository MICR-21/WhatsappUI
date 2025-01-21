package com.example.whatsappui.domain

import com.example.whatsappui.R

data class ChatListDataObject(
    val chatId: Int,
    val message: Message,
    val userName: String,
    val userImage: Int = R.drawable.ic_user
)
data class Message(
    val content: String,
    val deliveryStatus : MessageDeliveryStatus,
    val type: MessageType,
    val timeStamp: String,
    val unreadCount: Int? = null

)
enum class MessageDeliveryStatus {
    DELIVERED,
    READ,
    PENDING,
    ERROR,
    UNREAD
}
enum class MessageType{
    TEXT,
    IMAGE,
    VIDEO,
    AUDIO,
}