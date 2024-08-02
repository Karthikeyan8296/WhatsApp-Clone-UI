package com.example.whatsapp.data

import com.example.whatsapp.R
import com.example.whatsapp.domain.CallListDataObject
import com.example.whatsapp.domain.CallStatus

val CallList = listOf(
    CallListDataObject(
        userId = 1,
        userName = "John Doe",
        userImage = R.drawable.ic_profile3,
        callStatus = R.drawable.ic_callrecived,
        timeStamp = "5 minutes ago",
        callType = R.drawable.ic_call
    ),
    CallListDataObject(
        userId = 2,
        userName = "Alice Smith",
        userImage = R.drawable.ic_profile10,
        callStatus = R.drawable.ic_sent,
        timeStamp = "10 minutes ago",
        callType = R.drawable.ic_video_call
    ),

    CallListDataObject(
        userId = 3,
        userName = "Bob Johnson",
        userImage = R.drawable.ic_profile15,
        callStatus = R.drawable.ic_sent,
        timeStamp = "20 minutes ago",
        callType = R.drawable.ic_call
    ),

    CallListDataObject(
        userId = 4,
        userName = "Carol White",
        userImage = R.drawable.ic_profile12,
        callStatus = R.drawable.ic_callrecived,
        timeStamp = "15 minutes ago",
        callType = R.drawable.ic_video_call
    ),
)