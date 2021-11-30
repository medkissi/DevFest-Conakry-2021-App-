package com.dvilson.devfestconakry2021.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dvilson.devfestconakry2021.R
import com.dvilson.devfestconakry2021.TabItem
import com.dvilson.devfestconakry2021.ui.components.TabRow
import com.dvilson.devfestconakry2021.ui.tabs.TabsContent
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState

@ExperimentalPagerApi
@Composable
fun HomeScreen(navController: NavController,pagerState: PagerState) {


   Scaffold(

       topBar = { TopBar()},

       content ={paddingValues->
           Column(modifier = Modifier.padding(paddingValues = paddingValues)) {
               TabRow(tabs = TabItem.items.list, pagerState = pagerState)
               TabsContent(tabs =TabItem.items.list, navController = navController, pagerState = pagerState)

           }
       }
   )
}

@Composable
fun TopBar() {
    TopAppBar(
        title = {
            Text(
                stringResource(id = R.string.app_name),
                textAlign = TextAlign.Center
            )
        },
        elevation = 0.dp,
        navigationIcon = {
            Icon(
                painter = painterResource(id = R.drawable.gdg_logo),
                contentDescription =null,
                tint = Color.Unspecified
            )
        }

    )

}