package com.example.whatsapp.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.domain.ChatListDataObject
import com.example.whatsapp.domain.Message
import com.example.whatsapp.ui.theme.Badge
import com.example.whatsapp.ui.theme.TopAppbarComponent

@Composable
fun UserDetails(chatData: ChatListDataObject) {
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .padding(start = 16.dp, top = 8.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = chatData.userName,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                ),
                modifier = Modifier.weight(1f)
            )

            Text(
                text = chatData.message.timeStamp,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    color = if((chatData.unreadCount ?: 0) > 0) Color.Green else Color.Gray
                )
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = chatData.message.content,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Gray
                ),
                modifier = Modifier.weight(1f)
            )


            if(chatData.unreadCount != null){
            val modifier = Modifier
                .size(16.dp)
                .background(Color.Green, shape = CircleShape)

            Text(
                text = chatData.unreadCount?.toString() ?: "",
                modifier = modifier,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.Badge,
                ),
                textAlign = TextAlign.Center,
            )

            }

        }
    }
}