package com.example.whatsapp.ui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import com.example.whatsapp.R
import com.example.whatsapp.data.CallList
import com.example.whatsapp.domain.CallListDataObject
import com.example.whatsapp.ui.component.CallListComponent
import com.example.whatsapp.ui.component.CreateCallComponent
import com.example.whatsapp.ui.component.StatusListComponent

@Composable
fun CallScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 12.dp)) {

        item{
            CreateCallComponent()
        }
        item {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(vertical = 3.dp)
                    .padding(start = 16.dp)
            ) {
                Text(text = "Recent Calls", color = Color.Gray)
            }
        }

        items(CallList){callData->
            CallListItem(callData)
        }
    }
}

@Composable
fun CallListItem(calldata: CallListDataObject) {

    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 8.dp)) {
        CallListComponent(calldata)
    }

}


@Preview(showBackground = true)
@Composable
fun ShowCallPreview() {
    CallScreen()
}