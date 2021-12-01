package com.dvilson.devfestconakry2021.ui.tabs

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.dvilson.devfestconakry2021.ui.firstday.FirstDayScreen
import com.dvilson.devfestconakry2021.ui.secondday.SecondDayScreen
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState

private const val TAG = "TabsContent"

@ExperimentalPagerApi
@Composable
fun TabsContent(navController: NavController, pagerState: PagerState) {


    HorizontalPager(state = pagerState) { page ->
        when(page){
            0 -> FirstDayScreen(navController)
            1 -> SecondDayScreen(navController)
        }


    }
}



