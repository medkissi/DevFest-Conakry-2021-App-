package com.dvilson.devfestconakry2021.ui.onboarding

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dvilson.devfestconakry2021.data.Page
import com.dvilson.devfestconakry2021.ui.theme.GoogleBlue500
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import  com.dvilson.devfestconakry2021.R

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun OnBoardingScreen(//onGettingStartedClick: () -> Unit, onSkipClicked: () -> Unit
) {

    val pagerState = rememberPagerState(pageCount = 3)
    Column {
        Text(
            text = "Passer",
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
                .clickable {// onSkipClicked()
                     }

        )


        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) { page ->
            PageScreen(page = onboardPages[page] )


        }
        HorizontalPagerIndicator(
            pagerState = pagerState,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp),
            activeColor = GoogleBlue500
        )
        AnimatedVisibility(visible = pagerState.currentPage == 2) {
            OutlinedButton(
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                onClick = {},
                colors = ButtonDefaults.outlinedButtonColors(
                    backgroundColor = GoogleBlue500,
                    contentColor = Color.White
                )
            ) {
                Text(text = "Commencer")


            }


        }

    }


}

@Composable
fun PageScreen(page: Page) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Image(

            painter = painterResource(id = page.image),
            contentDescription = null,
            modifier = Modifier.size(200.dp)

        )
        Text(
            text = page.title,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = page.description,
            textAlign = TextAlign.Center,
            fontSize = 14.sp
        )
        Spacer(modifier = Modifier.height(12.dp))

    }

}

val onboardPages = listOf(

    Page(
        title = "Hey salut",
        description = " description",
        R.drawable.devfest2021_logo
    ),
    Page(
        title = "Hey salut",
        description = " description",
        R.drawable.devfest2021_logo
    ),
    Page(
        title = "Hey salut",
        description = " description",
        R.drawable.devfest2021_logo
    )
)