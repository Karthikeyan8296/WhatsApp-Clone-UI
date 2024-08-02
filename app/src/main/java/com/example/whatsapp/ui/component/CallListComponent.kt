package com.example.whatsapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R
import com.example.whatsapp.domain.CallListDataObject
import com.example.whatsapp.ui.theme.Badge
import com.example.whatsapp.ui.theme.Title
import com.example.whatsapp.ui.theme.TopAppbarComponent

@Composable
fun CallListComponent(calldata: CallListDataObject) {

    Row(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = calldata.userImage),
            contentDescription = null,
            modifier = Modifier.size(60.dp)
        )

        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(start = 16.dp)
                .weight(1f)
        ) {

            Text(
                text = calldata.userName,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = if (calldata.callStatus == R.drawable.ic_callrecived) Color.Red else MaterialTheme.colorScheme.Title
                )
            )

            Spacer(modifier = Modifier.height(4.dp))

            Row() {
                Icon(
                    painter = painterResource(id = calldata.callStatus),
                    contentDescription = null,
                    tint = if(calldata.callStatus == R.drawable.ic_callrecived) Color.Red else MaterialTheme.colorScheme.TopAppbarComponent,
                    modifier = Modifier.size(16.dp)
                )

                Text(
                    text = calldata.timeStamp,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray
                    )
                )
            }
        }

        Icon(
            painter = painterResource(id = calldata.callType),
            contentDescription = null,
            tint = Color(0xFF02B099)
        )

    }
}
