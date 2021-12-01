package com.dvilson.devfestconakry2021.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dvilson.devfestconakry2021.R
import com.dvilson.devfestconakry2021.Screen
import com.dvilson.devfestconakry2021.data.SaveBoolean
import com.dvilson.devfestconakry2021.ui.theme.GoogleBlue500
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavController) {
    val context = LocalContext.current
    val dataStore = SaveBoolean(context = context)

    val getIsFistTime = dataStore.getisFistTime.collectAsState(initial = false)



    LaunchedEffect(key1 = 1) {
        delay(1200)
        if (getIsFistTime.value) {
            navController.popBackStack()
            navController.navigate(Screen.HomeScreen.route)
        } else {
            navController.popBackStack()
            navController.navigate(Screen.OnBoardingScreen.route)
        }


    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(GoogleBlue500),

        ) {

        Image(
            painterResource(id = R.drawable.devfest2021_logo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .align(Alignment.Center)
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 40.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(
                text = "Développé par IIIIDAYS GROUP TECH",
                color = Color.White
            )
        }

    }

}