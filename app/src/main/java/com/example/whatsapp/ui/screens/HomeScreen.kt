package com.example.whatsapp.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.whatsapp.data.tabs
import com.example.whatsapp.ui.component.TabBarComponent
import com.example.whatsapp.ui.component.TopAppBarComponent
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen() {
    val pagerState = rememberPagerState(pageCount = {tabs.size})
    val scope = rememberCoroutineScope()

    Column(modifier = Modifier.fillMaxSize()) {

        TopAppBarComponent()

        TabBarComponent(
            pagerState = pagerState,
            initialIndex = 0,
            onTabSelected = {selectedPage ->
                scope.launch {
                    pagerState.animateScrollToPage(selectedPage)
                }
            }
        )

        HorizontalPager(
            modifier = Modifier.fillMaxSize(),
            state = pagerState,

        ) {page->
            when(page){
                0 -> ChatScreen()
                1 -> StatusScreen()
                2 -> CallScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}