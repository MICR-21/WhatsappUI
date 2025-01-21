package com.example.whatsappui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.whatsappui.data.INITIAL_SCREEN_INDEX
import com.example.whatsappui.data.tabs
import com.example.whatsappui.ui.theme.TabsComponent
import com.example.whatsappui.ui.theme.components.AppBarComponents
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(openConversation: () -> Unit = {}) {
    val pagerState = rememberPagerState(pageCount = { tabs.size },initialPage = INITIAL_SCREEN_INDEX)
    val scope = rememberCoroutineScope()

    Column {
        AppBarComponents()

        TabsComponent(
            initialIndex = INITIAL_SCREEN_INDEX,
            pagerState = pagerState,
            onTabSelected = { selectedPage ->
                scope.launch {
                    pagerState.animateScrollToPage(selectedPage)
                }
            }
        )

        HorizontalPager(
            modifier = Modifier.fillMaxSize(),
            state = pagerState,
        ) { page ->
            when (page) {
                0 -> ChatScreen(openConversation = openConversation)
                1 -> StatusScreen()
                2 -> CallsScreen()
                else -> {}
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
