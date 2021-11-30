package com.dvilson.devfestconakry2021

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.dvilson.devfestconakry2021.ui.firstday.FirstDayScreen
import com.dvilson.devfestconakry2021.ui.secondday.SecondDayScreen


typealias ComposableFun= @Composable () -> Unit



sealed class TabItem(var title: String,var screen: ComposableFun) {
    object JOUR1 : TabItem("Jour 1" ,{ FirstDayScreen(navController = rememberNavController())})
    object JOUR2 : TabItem("Jour 2",{SecondDayScreen(navController = rememberNavController())})

    object items{
        val list = listOf( JOUR1,JOUR2)
    }
}
