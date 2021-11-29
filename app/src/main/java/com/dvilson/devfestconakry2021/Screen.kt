package com.dvilson.devfestconakry2021

sealed class Screen( val route:String){
    object  FirstDayScreen:Screen(route = "first_day_screen")
    object  SecondDayScreen:Screen(route = "second_day_screen")
    object  DetailScreen:Screen(route = "detail")
    object HomeScreen:Screen(route= "home")
    object SplashScreen:Screen(route= "splash_screen")
    object OnBoardingScreen:Screen(route= "onBoarding")

}
