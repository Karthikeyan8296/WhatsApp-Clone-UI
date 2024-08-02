package com.example.whatsapp.domain

import com.example.whatsapp.R

data class CallListDataObject(
    val userId: Int,
    val userName: String,
    val userImage: Int,
    val callStatus: Int,
    val timeStamp: String,
    val callType: Int
)

enum class CallStatus{
    MISSED,
    RECEIVED,
    SENT,
    ERROR
}


