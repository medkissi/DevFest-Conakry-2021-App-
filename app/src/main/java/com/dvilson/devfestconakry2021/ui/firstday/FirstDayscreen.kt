package com.dvilson.devfestconakry2021.ui.firstday

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.dvilson.devfestconakry2021.data.Repository
import com.dvilson.devfestconakry2021.ui.components.SpeakerItem
import com.dvilson.devfestconakry2021.ui.theme.GoogleGreen500
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@Composable
fun FirstDayScreen(navController: NavController = rememberNavController()) {
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
            item {
                Box( )  {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(4.dp)
                            .height(60.dp)
                          ,
                        elevation = 2.dp,
                        backgroundColor = GoogleGreen500
                    ) {
                        Text(
                            text = "En ligne",
                            textAlign = TextAlign.Center,
                            color = Color.White
                        )

                    }
                }
            }
            items(speakers) { speaker ->
                SpeakerItem(speaker = speaker, navController = navController)

            }
        }
    }

}