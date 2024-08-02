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

@Composable
fun MyStatusComponent(modifier: Modifier = Modifier) {
    Row(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box {
            Image(
                painter = painterResource(id = R.drawable.ic_profile3),
                contentDescription = null,
                modifier = modifier.size(60.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.add),
                contentDescription = null,
                modifier = modifier
                    .size(20.dp)
                    .align(Alignment.BottomEnd)
            )
        }

        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(start = 16.dp)
        ) {

            Text(
                text = "My Status",
                style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Tap to add status update",
                style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Normal, color = Color.Gray),
            )

        }
    }
}