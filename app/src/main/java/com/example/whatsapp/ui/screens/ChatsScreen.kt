package com.example.whatsapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsapp.data.chatList
import com.example.whatsapp.domain.ChatListDataObject
import com.example.whatsapp.ui.component.ArchiveComponent
import com.example.whatsapp.ui.component.UserDetails
import com.example.whatsapp.ui.component.UserImage

@Composable
fun ChatScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 12.dp),
        horizontalAlignment = Alignment.Start
    ) {
        item {
            ArchiveComponent()
        }
        items(chatList) { chatData ->    //items always list format la dhan erukkanum//
            ChatListItem(chatData)
        }

    }
}

@Composable
fun ChatListItem(chatData: ChatListDataObject) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 8.dp)) {
        UserImage(chatData.userImage)
        UserDetails(chatData)
    }
}


@Preview(showBackground = true)
@Composable
fun ShowChatPreview() {
    ChatScreen()
}