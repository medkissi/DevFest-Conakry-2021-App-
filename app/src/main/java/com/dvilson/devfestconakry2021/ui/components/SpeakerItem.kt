package com.dvilson.devfestconakry2021.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.dvilson.devfestconakry2021.Screen
import com.dvilson.devfestconakry2021.data.Repository
import com.dvilson.devfestconakry2021.data.Speaker

@Composable
fun SpeakerItem(speaker: Speaker,navController:NavController) {
    Card(
        modifier = Modifier
            .height(135.dp)
            .padding(8.dp)
            .clickable {
                navController.currentBackStackEntry?.savedStateHandle?.set(
                    "speaker",
                    speaker
                )

                navController.navigate(Screen.DetailScreen.route)
            },
        elevation = 4.dp,
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp),
            verticalAlignment = Alignment.CenterVertically

            ) {
            Image(
                painterResource(
                    id = speaker.image
                ),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(90.dp, 90.dp)
                    .clip(CircleShape)


            )

            Column(
                modifier =  Modifier
                    .padding(8.dp),
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = speaker.name,
                    style = MaterialTheme.typography.subtitle1,
                    fontWeight = FontWeight.Bold

                )
                Text(
                    text = speaker.subject,
                    style = MaterialTheme.typography.subtitle2,
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.BottomEnd
                ) {
                    Text(
                        text = speaker.time,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

        }

    }

}
@Preview(showBackground = true)
@Composable
fun SpeakerItemPreview() {
    val navController = rememberNavController()
    val speaker = Repository.getSecondDaySpeaker().get(4)
    SpeakerItem(speaker = speaker, navController = navController)

}