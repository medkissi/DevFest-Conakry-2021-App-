package com.dvilson.devfestconakry2021.ui.secondday

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import com.dvilson.devfestconakry2021.ui.firstday.FirstDayScreenContent
import com.dvilson.devfestconakry2021.ui.theme.GoogleGreen500
import com.dvilson.devfestconakry2021.ui.theme.GoogleYellow500
import androidx.compose.material.Card as Card

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
            item {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Card(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp)
                            .height(60.dp),
                        elevation = 2.dp,
                        backgroundColor = GoogleYellow500
                    ) {
                        Text(
                            text = "En présentiel",
                            //textAlign = TextAlign.Center,
                            color = Color.White,
                            modifier = Modifier

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