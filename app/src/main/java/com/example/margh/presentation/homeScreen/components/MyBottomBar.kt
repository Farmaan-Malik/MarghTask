package com.example.margh.presentation.homeScreen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.sharp.FavoriteBorder
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MyBottomBar(navController : NavController) {

    BottomAppBar(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(bottom = 8.dp),
    ) {
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("HomeScreen") },
            icon = {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        imageVector = if (navController.currentDestination?.route == "HomeScreen"){Icons.Filled.Home}else
                            Icons.Outlined.Home ,
                        contentDescription = null,
                        tint =if (navController.currentDestination?.route == "HomeScreen"){Color(
                            0xFF232E6B
                        )
                        } else Color.Black, modifier = Modifier
                            .height(30.dp)
                            .width(30.dp)
                    )
                    Text(text = "Home", color = Color.Black, textAlign = TextAlign.Center, fontSize = 12.sp)
                }
            },
            colors = NavigationBarItemDefaults.colors(unselectedIconColor = Color.White)
        )
        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        imageVector = Icons.Sharp.FavoriteBorder,
                        contentDescription = null,
                        tint = Color.Black, modifier = Modifier
                            .height(30.dp)
                            .width(30.dp)
                    )
                    Text(text = "Saved", color = Color.Black, textAlign = TextAlign.Center, fontSize = 12.sp)
                }
            },
            colors = NavigationBarItemDefaults.colors(unselectedIconColor = Color.White)
        )
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("ProfileScreen") },
            icon = {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        imageVector = if (navController.currentDestination?.route == "ProfileScreen"){Icons.Filled.Person}else
                            Icons.Outlined.Person,
                        contentDescription = null,
                        tint = if (navController.currentDestination?.route == "ProfileScreen"){Color(
                            0xFF232E6B
                        )
                        } else Color.Black,
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp)
                    )
                    Text(text = "Profile", color = Color.Black, textAlign = TextAlign.Center, fontSize = 12.sp)
                }
            },
            colors = NavigationBarItemDefaults.colors(unselectedIconColor = Color.White)
        )

    }
}
