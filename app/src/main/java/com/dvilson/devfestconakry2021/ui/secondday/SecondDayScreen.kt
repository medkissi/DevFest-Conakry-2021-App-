package com.dvilson.devfestconakry2021.ui.secondday

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
import com.dvilson.devfestconakry2021.ui.firstday.FirstDayScreenContent

@Composable
fun SecondDayScreen(navController: NavController = rememberNavController()) {
    Scaffold(
        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues = it)
            ) {
                SecondDayScreenContent(navController = navController)
            }
        },

        )

}

@Composable
fun SecondDayScreenContent(navController: NavController) {
    val speakers = Repository.getSecondDaySpeaker()
    Box() {
        LazyColumn() {
            items(speakers) { speaker ->
                SpeakerItem(speaker = speaker,navController = navController)

            }
        }
    }

}