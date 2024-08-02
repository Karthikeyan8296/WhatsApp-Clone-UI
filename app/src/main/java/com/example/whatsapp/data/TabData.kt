package com.example.whatsapp.data


data class TabData (
    val title : String,
    val unreadCount: Int?,   //badge

)

val tabs = listOf(
    TabData(title = Tabs.CHATS.value, unreadCount = 6),
    TabData(title = Tabs.STATUS.value, unreadCount = null),
    TabData(title = Tabs.CALL.value, unreadCount = 2)
)

// entha mathiri strings uh periya apps la use pannum bothu enum class ah create panni vaikirathu best uh//

enum class Tabs(val value: String){
    CHATS("Chats"),
    STATUS("Status"),
    CALL("Call")
}