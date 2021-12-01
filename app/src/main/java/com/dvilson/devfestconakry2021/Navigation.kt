package com.dvilson.devfestconakry2021

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dvilson.devfestconakry2021.data.Speaker
import com.dvilson.devfestconakry2021.ui.SplashScreen
import com.dvilson.devfestconakry2021.ui.detail.DetailScreen
import com.dvilson.devfestconakry2021.ui.firstday.FirstDayScreen
import com.dvilson.devfestconakry2021.ui.home.HomeScreen
import com.dvilson.devfestconakry2021.ui.onboarding.OnBoardingScreen
import com.dvilson.devfestconakry2021.ui.secondday.SecondDayScreen
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState

@ExperimentalPagerApi
@ExperimentalAnimationApi
@Composable
fun Navigation() {
    val navController = rememberNavController()
    val pagerState = rememberPagerState(2)

    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route,
    ) {

        composable(
            route = Screen.FirstDayScreen.route,

            ) {
            FirstDayScreen(navController = navController)

        }

        composable(route = Screen.SecondDayScreen.route) {
            SecondDayScreen(navController = navController)
        }

        composable(route = Screen.DetailScreen.route) {
            val speaker =
                navController.previousBackStackEntry?.savedStateHandle?.get<Speaker>("speaker")
            speaker?.let {
                DetailScreen(speaker = it, navController)
            }
        }
        composable(Screen.HomeScreen.route) {
            HomeScreen(navController = navController, pagerState = pagerState)
        }
        composable(Screen.SplashScreen.route) {
            SplashScreen(navController)
        }
        composable(Screen.OnBoardingScreen.route) {
            OnBoardingScreen(navController = navController)
        }

    }


}