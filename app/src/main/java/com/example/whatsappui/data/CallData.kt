package com.example.whatsappui.data

import com.example.whatsappui.R // Ensure to replace with your actual resource import
import com.example.whatsappui.domain.CallDataObject

val callsList = listOf(
    CallDataObject(R.drawable.ic_user, "Alice", "Incoming", "Today, 10:30 AM"),
    CallDataObject(R.drawable.ic_user, "Bob", "Missed", "Yesterday, 3:15 PM"),
    CallDataObject(R.drawable.ic_user, "Charlie", "Outgoing", "Monday, 7:45 PM"),
    CallDataObject(R.drawable.ic_user, "John Smith", "Incoming (5 min)", "Sunday, 11:15 PM"),
    CallDataObject(R.drawable.ic_user, "Sarah Parker", "Video Call (15 min)", "Sunday, 3:20 PM"),
    CallDataObject(R.drawable.ic_user, "Mike Johnson", "Rejected", "Saturday, 2:45 PM"),
    CallDataObject(R.drawable.ic_user, "Lisa Brown", "Missed (3)", "Friday, 1:10 PM"),
    CallDataObject(R.drawable.ic_user, "David Wilson", "Conference Call (45 min)", "Friday, 11:30 AM"),
    CallDataObject(R.drawable.ic_user, "Sophie Turner", "Video Call Failed", "Thursday, 10:15 PM"),
    CallDataObject(R.drawable.ic_user, "Alex Martinez", "Voicemail (1:20)", "Thursday, 9:45 AM"),
    CallDataObject(R.drawable.ic_user, "Rachel Green", "Outgoing (No Answer)", "Wednesday, 8:20 PM"),
    CallDataObject(R.drawable.ic_user, "James Anderson", "WhatsApp Call (8 min)", "Wednesday, 4:30 PM"),
    CallDataObject(R.drawable.ic_user, "Emily Clark", "Group Call (30 min)", "Tuesday, 8:15 PM"),
    CallDataObject(R.drawable.ic_user, "Tom Harris", "Blocked", "Tuesday, 7:00 AM"),
    CallDataObject(R.drawable.ic_user, "Jessica White", "FaceTime (12 min)", "Monday, 5:45 PM"),
    CallDataObject(R.drawable.ic_user, "Daniel Lee", "Callback Reminder", "Monday, 4:30 PM"),
    CallDataObject(R.drawable.ic_user, "Maria Garcia", "Business Call (25 min)", "Sunday, 2:15 PM"),
    CallDataObject(R.drawable.ic_user, "Chris Evans", "Emergency Call (1 min)", "Saturday, 3:40 AM"),
    CallDataObject(R.drawable.ic_user, "Anna Smith", "Scheduled Call", "Friday, 9:00 AM"),
    CallDataObject(R.drawable.ic_user, "Peter Wong", "Conference Failed", "Thursday, 1:25 PM"),
    CallDataObject(R.drawable.ic_user, "Lucy Miller", "Meeting Call (60 min)", "Wednesday, 10:30 AM")
    // Add more call entries as needed
)
