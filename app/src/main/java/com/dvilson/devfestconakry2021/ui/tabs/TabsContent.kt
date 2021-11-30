package com.dvilson.devfestconakry2021.ui.tabs

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.dvilson.devfestconakry2021.TabItem
import com.dvilson.devfestconakry2021.ui.SplashScreen
import com.dvilson.devfestconakry2021.ui.firstday.FirstDayScreen
import com.dvilson.devfestconakry2021.ui.secondday.SecondDayScreen
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState

private const val TAG = "TabsContent"

@ExperimentalPagerApi
@Composable
fun TabsContent(tabs:List<TabItem>,navController: NavController, pagerState: PagerState) {


    HorizontalPager(state = pagerState) { page ->
        tabs[page].screen()


    }
}



