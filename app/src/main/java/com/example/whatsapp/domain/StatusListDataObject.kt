package com.example.whatsapp.domain

data class StatusListDataObject(
    val userID: Int,
    val userName: String,
    val timeStamp: String,
    val userImage: Int,
    val statusImage: Int
)