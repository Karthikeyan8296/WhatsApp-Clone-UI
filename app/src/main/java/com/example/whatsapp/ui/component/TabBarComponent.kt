package com.example.whatsapp.ui.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.alpha
import com.example.whatsapp.R
import com.example.whatsapp.data.TabData
import com.example.whatsapp.data.tabs
import com.example.whatsapp.ui.theme.TopAppbarComponent
import com.example.whatsapp.ui.theme.Whatsapp_Green_Dark
import kotlinx.coroutines.flow.collectLatest

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TabBarComponent(
    initialIndex : Int = 0,
    pagerState: PagerState,
    onTabSelected : (Int) -> Unit
) {

    var selectedIndex by remember {     // initially this tab will be shown//
        mutableStateOf(initialIndex)
    }

    //Swipeable with the indicator effect in tabbar
    LaunchedEffect(pagerState) {
        snapshotFlow { pagerState.currentPage }.collectLatest {
            selectedIndex = it
            onTabSelected(selectedIndex)
        }
    }

    TabRow(
        selectedTabIndex = selectedIndex,
        modifier = Modifier.fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.TopAppbarComponent,
        contentColor = Color.White,
        indicator = {tabPosition ->
            TabRowDefaults.SecondaryIndicator(
                modifier = Modifier.tabIndicatorOffset(tabPosition[selectedIndex]),
                color = Color.White
            )
        }
    )
    {
        tabs.forEachIndexed { index, tabData ->
            Tab(
                selected = index == selectedIndex,
                onClick = { selectedIndex = index
                          onTabSelected(selectedIndex)},
                text = {
                    if(tabData.unreadCount == null){
                        TabTitle(tabData.title)
                    }
                    else {
                        TabWithUnreadCount(tabData = tabData)
                    }
                }
            )
        }
    }
}


@Composable
private fun TabTitle(title: String) {
    Text(
        text = title,
        style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
    )
}

@Composable
fun TabWithUnreadCount(tabData: TabData) {
    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center) {

        //text//
        TabTitle(tabData.title)

        //badge//
        tabData?.unreadCount?.also{unreadCount ->
            Text(
                text = unreadCount.toString(),
                modifier = Modifier
                    .padding(6.dp)
                    .size(19.dp)
                    .background(Color.White, shape = CircleShape),
                color = MaterialTheme.colorScheme.TopAppbarComponent
            )
        }

    }

}

@Composable
@Preview(showBackground = true)
fun showTabBarPreview() {
}