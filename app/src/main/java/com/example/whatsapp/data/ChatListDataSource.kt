package com.example.whatsapp.data

import com.example.whatsapp.R
import com.example.whatsapp.domain.ChatListDataObject
import com.example.whatsapp.domain.Message
import com.example.whatsapp.domain.MessageDeliveryStatus
import com.example.whatsapp.domain.MessageType

val chatList = listOf(
    ChatListDataObject(
        chatID = 1,
        message = Message(
            content = "Hey, what's up",
            timeStamp = "25/07/20024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "John",
        unreadCount = 5,
        userImage = R.drawable.ic_profile1
    ),

    ChatListDataObject(
        chatID = 2,
        message = Message(
            content = "Hello, how are you?",
            timeStamp = "24/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ
        ),
        userName = "Arjun",
        unreadCount = null,
        userImage =R.drawable.ic_profile2
    ),

    ChatListDataObject(
        chatID = 3,
        message = Message(
            content = "Meeting at 5 PM.",
            timeStamp = "23/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.SENT
        ),
        userName = "Priya",
        userImage = R.drawable.ic_profile3
    ),

    ChatListDataObject(
        chatID = 4,
        message = Message(
            content = "Happy Birthday!",
            timeStamp = "22/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Ravi",
        userImage = R.drawable.ic_profile4
    ),

    ChatListDataObject(
        chatID = 5,
        message = Message(
            content = "Check your email.",
            timeStamp = "21/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.PENDING
        ),
        userName = "Suresh"
        ,
        unreadCount = 2,
        userImage = R.drawable.ic_profile5
    ),

    ChatListDataObject(
        chatID = 6,
        message = Message(
            content = "Let's catch up soon.",
            timeStamp = "20/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ
        ),
        userName = "Anita",
        userImage = R.drawable.ic_profile6
    ),

    ChatListDataObject(
        chatID = 7,
        message = Message(
            content = "Where are you?",
            timeStamp = "19/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Vijay",
        userImage = R.drawable.ic_profile7
    ),

    ChatListDataObject(
        chatID = 8,
        message = Message(
            content = "Good morning!",
            timeStamp = "18/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.SENT
        ),
        userName = "Deepa",
        userImage = R.drawable.ic_profile8
    ),

    ChatListDataObject(
        chatID = 9,
        message = Message(
            content = "See you at the party.",
            timeStamp = "17/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Rohan",
        userImage = R.drawable.ic_profile12
    ),

    ChatListDataObject(
        chatID = 10,
        message = Message(
            content = "Can we reschedule?",
            timeStamp = "16/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.ERROR
        ),
        userName = "Maya",
        userImage = R.drawable.ic_profile11
    ),
    ChatListDataObject(
        chatID = 11,
        message = Message(
            content = "See you later!",
            timeStamp = "20/06/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.SENT
        ),
        userName = "Katie",
        userImage = R.drawable.ic_profile16
    ),
    ChatListDataObject(
        chatID = 12,
        message = Message(
            content = "What's new?",
            timeStamp = "15/06/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Liam",
        userImage = R.drawable.ic_profile17
    ),
    ChatListDataObject(
        chatID = 13,
        message = Message(
            content = "How was your weekend?",
            timeStamp = "10/06/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.SEEN
        ),
        userName = "Mia",
        userImage = R.drawable.ic_profile18
    ),
    ChatListDataObject(
        chatID = 14,
        message = Message(
            content = "Are you free tomorrow?",
            timeStamp = "05/06/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Noah",
        userImage = R.drawable.ic_profile19
    ),
    ChatListDataObject(
        chatID = 15,
        message = Message(
            content = "Let's hang out sometime!",
            timeStamp = "01/06/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.SENT
        ),
        userName = "Olivia",
        userImage = R.drawable.ic_profile9
    ),
    ChatListDataObject(
        chatID = 16,
        message = Message(
            content = "Just checking in!",
            timeStamp = "25/05/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Peter",
        userImage = R.drawable.ic_profile10
    ),
    ChatListDataObject(
        chatID = 17,
        message = Message(
            content = "Hope you're doing well!",
            timeStamp = "20/05/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.SEEN
        ),
        userName = "Quinn",
        userImage = R.drawable.ic_profile9
    ),
    ChatListDataObject(
        chatID = 18,
        message = Message(
            content = "Talk to you soon!",
            timeStamp = "15/05/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Ryan",
        userImage = R.drawable.ic_profile16
    ),
    ChatListDataObject(
        chatID = 19,
        message = Message(
            content = "Take care!",
            timeStamp = "10/05/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.SENT
        ),
        userName = "Sophia",
        userImage = R.drawable.ic_profile20
    ),
    ChatListDataObject(
        chatID = 20,
        message = Message(
            content = "Bye for now!",
            timeStamp = "05/05/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Thomas",
        userImage = R.drawable.ic_profile15
    )
)

