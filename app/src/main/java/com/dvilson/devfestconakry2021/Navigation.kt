package com.dvilson.devfestconakry2021

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import com.dvilson.devfestconakry2021.data.Speaker
import com.dvilson.devfestconakry2021.ui.SplashScreen
import com.dvilson.devfestconakry2021.ui.detail.DetailScreen
import com.dvilson.devfestconakry2021.ui.firstday.FirstDayScreen
import com.dvilson.devfestconakry2021.ui.home.HomeScreen
import com.dvilson.devfestconakry2021.ui.onboarding.OnBoardingScreen
import com.dvilson.devfestconakry2021.ui.onboarding.onboardPages
import com.dvilson.devfestconakry2021.ui.secondday.SecondDayScreen
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState

@ExperimentalPagerApi
@ExperimentalAnimationApi
@Composable
fun Navigation() {
    val navController = rememberAnimatedNavController()
    val pagerState = rememberPagerState(2)

    AnimatedNavHost(navController = navController, startDestination = Screen.HomeScreen.route ){

        composable( route = Screen.FirstDayScreen.route ){
            FirstDayScreen(navController = navController)

        }

        composable(route = Screen.SecondDayScreen.route){
            SecondDayScreen(navController = navController)
        }

        composable(route = Screen.DetailScreen.route){
            val speaker =
                navController.previousBackStackEntry?.savedStateHandle?.get<Speaker>("speaker")
            speaker?.let {
                DetailScreen(speaker = it, navController)
            }
        }
        composable(Screen.HomeScreen.route){
            HomeScreen(navController = navController,pagerState = pagerState)
        }
        composable(Screen.SplashScreen.route){
            SplashScreen()
        }
        composable(Screen.OnBoardingScreen.route){
            OnBoardingScreen()
        }

    }


}