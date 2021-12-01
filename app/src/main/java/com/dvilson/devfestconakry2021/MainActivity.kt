package com.dvilson.devfestconakry2021

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import com.dvilson.devfestconakry2021.ui.theme.DevFestConakry2021Theme
import com.google.accompanist.pager.ExperimentalPagerApi

class MainActivity : ComponentActivity() {


    @ExperimentalAnimationApi
    @ExperimentalPagerApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        setContent {
            DevFestConakry2021Theme {

                Navigation()


            }
        }
    }




}




