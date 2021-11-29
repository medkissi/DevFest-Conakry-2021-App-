package com.dvilson.devfestconakry2021.ui.firstday

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.dvilson.devfestconakry2021.data.Repository
import com.dvilson.devfestconakry2021.ui.components.SpeakerItem
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@Composable
fun FirstDayScreen(navController: NavController) {
    Scaffold(
        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues = it)
            ) {
                FirstDayScreenContent(navController = navController)
            }
        },

        )

}

@Composable
fun FirstDayScreenContent(navController: NavController) {
    val speakers = Repository.getFirstDaySpeaker()
    Box() {
        LazyColumn() {
            items(speakers) { speaker ->
                SpeakerItem(speaker = speaker,navController = navController)

            }
        }
    }

}