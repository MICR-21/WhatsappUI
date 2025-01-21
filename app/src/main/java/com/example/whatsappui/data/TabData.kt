package com.example.whatsappui.data

data class TabData(
    val title: String,
    val unreadCount: Int?


)
val tabs = listOf (
    TabData(title= Tabs.CHATS.value, unreadCount = 10),
    TabData(title= Tabs.STATUS.value, unreadCount = 4),
    TabData(title= Tabs.CALLS.value, unreadCount = 8)

)
enum class Tabs(val value:String){
    CHATS("Chats"),
    STATUS("Status"),
    CALLS("Calls")
}
const val INITIAL_SCREEN_INDEX = 0