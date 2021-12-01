package com.dvilson.devfestconakry2021.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun PauseDejeune(heure:String) {
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
                .padding(start = 8.dp,end=8.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {


            Column(
                modifier =  Modifier
                    .padding(8.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text ="PAUSE DEJEUNER",
                    style = MaterialTheme.typography.subtitle1,
                    fontWeight = FontWeight.Bold

                )

                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = heure,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

        }

    }
}
