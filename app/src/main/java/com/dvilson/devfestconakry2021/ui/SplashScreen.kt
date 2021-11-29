package com.dvilson.devfestconakry2021.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dvilson.devfestconakry2021.R
import com.dvilson.devfestconakry2021.ui.theme.GoogleBlack500
import com.dvilson.devfestconakry2021.ui.theme.GoogleBlue500

@Preview(showBackground = true)
@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(GoogleBlue500),

    ) {

        Image(
            painterResource(id = R.drawable.devfest2021_logo),
            contentDescription =null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .align(Alignment.Center)
            )

        Box(
            modifier = Modifier.fillMaxSize()
                .padding(bottom = 40.dp),
            contentAlignment = Alignment.BottomCenter
        ){
            Text("Développé par IIIDAYS GROUP TECH")
        }

    }

}