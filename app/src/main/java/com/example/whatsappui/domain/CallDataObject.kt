package com.example.whatsappui.domain

data class CallDataObject(
    val userImage: Int,  // Drawable resource for user image
    val userName: String,
    val callType: String, // "Incoming", "Outgoing", etc.
    val callTime: String
)
