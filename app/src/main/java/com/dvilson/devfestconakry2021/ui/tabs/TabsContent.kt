package com.dvilson.devfestconakry2021.ui.tabs

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.dvilson.devfestconakry2021.TabItem
import com.dvilson.devfestconakry2021.ui.firstday.FirstDayScreen
import com.dvilson.devfestconakry2021.ui.secondday.SecondDayScreen
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState

@ExperimentalPagerApi
@Composable
fun TabsContent(navController: NavController, pagerState: PagerState) {
    val tabs = listOf(
        FirstDayScreen(navController = navController),
        SecondDayScreen(navController = navController)
    )
    HorizontalPager(state = pagerState) { page ->
      tabs[page]
    }
}