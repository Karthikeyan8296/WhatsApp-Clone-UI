package com.example.whatsapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val Whatsapp_Green_Dark = Color(0xFF075E54)
val Whatsapp_Green_light = Color(0xFF25D366)



val ColorScheme.TopAppbarComponent
@Composable
get() = if(isSystemInDarkTheme()) Whatsapp_Green_Dark else Whatsapp_Green_light

val ColorScheme.Badge
    @Composable
    get() = if(isSystemInDarkTheme()) Color.Black else Color.White

val ColorScheme.Title
    @Composable
    get() = if(isSystemInDarkTheme()) Color.White else Color.Black