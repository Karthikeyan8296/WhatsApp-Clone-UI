package com.example.whatsapp.domain

import androidx.compose.ui.graphics.Color
import com.example.whatsapp.R

data class ChatListDataObject(
    val chatID: Int,
    val message : Message,
    val userName : String,
    val userImage : Int,
    val unreadCount : Int? = null
)

data class Message(
    val content : String,
    val deliveryStatus : MessageDeliveryStatus,
    val type : MessageType,
    val timeStamp: String
)

enum class MessageDeliveryStatus{
    DELIVERED,
    SEEN,
    READ,
    SENT,
    PENDING,
    ERROR
}

enum class MessageType{
    TEXT,
    AUDIO,
    VIDEO,
    IMAGE,
    LOCATION
}