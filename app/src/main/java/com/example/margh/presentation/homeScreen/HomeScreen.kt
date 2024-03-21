package com.example.margh.presentation.homeScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.margh.presentation.homeScreen.components.MyBottomBar
import com.example.margh.presentation.homeScreen.components.MyTopBar
import com.example.margh.presentation.homeScreen.components.MyVerticalPager

@Composable
fun HomeScreen(navController : NavHostController) {
    Scaffold(topBar = { MyTopBar()}, bottomBar = { MyBottomBar(navController)}) {
        paddingValues ->  
    Column(modifier = Modifier.fillMaxSize().padding(top = paddingValues.calculateTopPadding(), bottom = paddingValues.calculateBottomPadding())){
        MyVerticalPager()
    }

    }
}