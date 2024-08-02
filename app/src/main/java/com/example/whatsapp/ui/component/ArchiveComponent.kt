package com.example.whatsapp.ui.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat.Style
import com.example.whatsapp.R
import com.example.whatsapp.ui.theme.Whatsapp_Green_light

@Composable
fun ArchiveComponent() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp)
            .padding(start = 8.dp)
            .wrapContentHeight(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            painter = painterResource(id = R.drawable.ic_archive),
            contentDescription = null,
            tint = Color(0xFF128C7E),
            modifier = Modifier.size(28.dp)
        )

        Text(
            text = "Archive",
            style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.SemiBold),
            modifier = Modifier
                .weight(1f)
                .padding(start = 10.dp)
        )

        Text(
            text = "1",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF128C7E)
            )
        )
    }

}

@Composable
@Preview(showBackground = true)
fun ShowArchivePreview() {
    ArchiveComponent()
}