package com.dvilson.devfestconakry2021.ui.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dvilson.devfestconakry2021.data.Speaker


@Composable
fun DetailScreen(speaker: Speaker, navController: NavController) {

    Scaffold(

        content = {
            Box(modifier = Modifier.padding(paddingValues = it)) {
                DetailScreenContent(speaker= speaker, navController = navController)
            }
        }


    )


}


@Composable
fun DetailScreenContent(speaker: Speaker, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {

        Box(
            modifier = Modifier.fillMaxSize()
        ) {

            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painterResource(id = speaker.image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()

                        .height(250.dp),


                )
            }
            Box(
                modifier = Modifier.fillMaxSize(),
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = null,
                            tint = Color.White
                        )

                    }

                }
            }

        }

        Surface(
            modifier = Modifier
                .offset(0.dp, (-25).dp),
            shape = RoundedCornerShape(25.dp),
        ) {

            Column(
                modifier = Modifier
                    .padding(15.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,

                    ) {

                    Text(speaker.name)

                }

                Text(
                    text = "Description",
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                Text(
                    speaker.description,
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier.fillMaxSize()
                )

            }

        }


    }


}
