package com.dvilson.devfestconakry2021.ui.firstday

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dvilson.devfestconakry2021.Screen
import com.dvilson.devfestconakry2021.data.Repository
import com.dvilson.devfestconakry2021.ui.components.PauseDejeune
import com.dvilson.devfestconakry2021.ui.components.SpeakerItem
import com.dvilson.devfestconakry2021.ui.theme.GoogleGreen500

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
    Box( contentAlignment = Alignment.Center) {
        LazyColumn() {
            item {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center,
                ) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .height(60.dp),
                        elevation = 2.dp,
                        backgroundColor = GoogleGreen500
                    ) {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Text(
                                text = "En ligne",
                                color = Color.White,
                                modifier = Modifier

                            )

                        }

                    }
                }
            }
            item{
                Card(
                    modifier = Modifier
                        .height(100.dp)
                        .padding(8.dp)
                        .clickable {},
                    elevation = 4.dp,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 8.dp, end = 8.dp),
                        verticalAlignment = Alignment.CenterVertically

                    ) {


                        Column(
                            modifier =  Modifier
                                .padding(8.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text ="Accueil et installation",
                                style = MaterialTheme.typography.subtitle1,
                                fontWeight = FontWeight.Bold

                            )
                            Text(
                                text = "DevFest Conakry 2021 Organizing Team",
                                style = MaterialTheme.typography.subtitle2,
                            )
                            Box(
                                modifier = Modifier
                                    .fillMaxSize(),
                                contentAlignment = Alignment.BottomEnd
                            ) {
                                Text(
                                    text ="9:00 AM",
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }

                    }

                }
            }

            items(speakers) { speaker ->
                if(speaker.id != 8){
                    SpeakerItem(speaker = speaker, navController = navController)
                }else{
                    PauseDejeune("2:30 PM")

                }

            }
        }
    }

}