package com.example.whatsappui.domain

data class StatusDataObject(
    val userImage: Int,  // Drawable resource for user image
    val userName: String,
    val statusTime: String // E.g., "Today, 8:30 AM"
)
