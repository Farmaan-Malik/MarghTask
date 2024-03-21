package com.example.margh.presentation.profileScreen

import android.widget.TextView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.margh.R
import com.example.margh.presentation.homeScreen.components.MyBottomBar

@Composable
fun ProfileScreen(navController: NavHostController) {
  Scaffold(bottomBar = { MyBottomBar(navController = navController)}) {
      paddingValues->
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = paddingValues.calculateTopPadding()), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        Text("Profile", fontWeight = FontWeight.Bold, fontSize = 32.sp)
        Spacer(modifier = Modifier.height(40.dp))
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = null,
            modifier = Modifier
                .height(100.dp)
                .width(100.dp)
                .clip(
                    CircleShape
                ),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(32.dp))
        Card(
            elevation = CardDefaults.cardElevation(20.dp),
            colors = CardDefaults.cardColors(Color.White)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp), contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Your Name",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
        Spacer(modifier = Modifier.height(32.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(60.dp), horizontalArrangement = Arrangement.SpaceBetween) {
            Card(
                elevation = CardDefaults.cardElevation(20.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {
                Box(
                    modifier = Modifier
                        .width(180.dp)
                        .height(60.dp), contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Share",
//                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Card(
                elevation = CardDefaults.cardElevation(20.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {
                Box(
                    modifier = Modifier
                        .width(180.dp)
                        .height(60.dp), contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Contact Us",
//                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(32.dp))
        Card(
            elevation = CardDefaults.cardElevation(20.dp),
            colors = CardDefaults.cardColors(Color.White)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp), contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "About us",
//                        fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
        Spacer(modifier = Modifier.height(70.dp))
        Button(onClick = { /*TODO*/ }, shape = RectangleShape, colors = ButtonDefaults.buttonColors(
            Color.LightGray)) {
            Text(text = "LOGOUT", color = Color.Black, fontSize = 12.sp)
        }
    }

  }
}