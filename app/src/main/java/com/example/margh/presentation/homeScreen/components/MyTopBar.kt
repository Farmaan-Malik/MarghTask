package com.example.margh.presentation.homeScreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.margh.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBar() {
    Column(modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)) {
    TopAppBar(title = { Text("Wake up and live your dreams.", fontWeight = FontWeight.Bold, letterSpacing = -1.sp)},)
        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.padding(horizontal = 10.dp)) {
            Button(onClick = { /*TODO*/ }, shape = RectangleShape,modifier = Modifier
                .wrapContentSize()
                .height(40.dp)
                .clip(
                    RoundedCornerShape(3)
                )) {
                Text(text = "Random quotes", fontSize = 18.sp, letterSpacing = -1.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(containerColor = Color.White), modifier = Modifier

                .fillMaxWidth()
                .border(1.dp, Color.LightGray, shape = RoundedCornerShape(50))
            ) {
                Row( modifier = Modifier
                    .fillMaxWidth()
                    .background(shape = RoundedCornerShape(30), color = Color.White),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Search,
                        contentDescription = null,
                        tint = Color.Black
                    )
                    Icon(painter = painterResource(id = R.drawable.mic2), contentDescription = null, tint = Color.Black, modifier = Modifier.size(20.dp))
                }
            }
        }
    }

}