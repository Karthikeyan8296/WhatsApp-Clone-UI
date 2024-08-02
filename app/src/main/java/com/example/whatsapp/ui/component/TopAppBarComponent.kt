package com.example.whatsapp.ui.component

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R
import com.example.whatsapp.ui.theme.TopAppbarComponent
import com.example.whatsapp.ui.theme.Whatsapp_Green_Dark
import com.example.whatsapp.ui.theme.Whatsapp_Green_light

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarComponent(modifier: Modifier = Modifier) {
    TopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.Whatsapp_title),
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            titleContentColor = Color.White,
            containerColor = MaterialTheme.colorScheme.TopAppbarComponent,
            actionIconContentColor = Color.White
        ),

        actions = {
            IconComponent(icon = R.drawable.ic_camera, onclick = {/**/})
            IconComponent(icon = R.drawable.ic_search, onclick = {/**/})
            IconComponent(icon = R.drawable.ic_more_vent, onclick = {/**/})
        }
    )
}

@Composable
fun IconComponent(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int,
    onclick: () -> Unit
) {
    IconButton(onClick = { onclick() }) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = null
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ShowTopBar() {
    TopAppBarComponent()
}