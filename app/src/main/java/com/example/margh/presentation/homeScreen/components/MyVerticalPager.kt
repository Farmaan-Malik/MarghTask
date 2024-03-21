package com.example.margh.presentation.homeScreen.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.example.margh.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MyVerticalPager() {
    val imageList = listOf(
        R.drawable.i1,
        R.drawable.i2,
        R.drawable.i3,
        R.drawable.i4,
        R.drawable.i5,
        R.drawable.i6
    )
    val pagerState = rememberPagerState(pageCount = { imageList.size }, initialPage = 0)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        verticalArrangement = Arrangement.Center
    ) {

        VerticalPager(state = pagerState, pageSize = PageSize.Fill) { page ->
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(imageList[page]).build(),
                contentScale = ContentScale.Fit,
                contentDescription = null,
                modifier = Modifier
                    .padding(
                        start = 8.dp, end = 8.dp, bottom = 0.dp
                    )
                    .fillMaxHeight(.91f)
            )
            Row(
                modifier = Modifier
                    .offset(y = -11.dp)
                    .fillMaxWidth()
                    .height(75.dp)
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .clip(RoundedCornerShape(13))
                    .background(Color.White),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                NavigationBarItem(selected = false, onClick = { /*TODO*/ }, icon = {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.FavoriteBorder,
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize(.6f),
                            tint = Color.Black
                        )
                        Text(text = "Save", textAlign = TextAlign.Center, fontSize = 12.sp)
                    }
                })
                NavigationBarItem(selected = false, onClick = { /*TODO*/ }, icon = {
                    Column(verticalArrangement = Arrangement.Center) {
                        Icon(
                            painter = painterResource(id = R.drawable.outline_file_download_24),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize(.6f)
                        )
                        Text(text = "Download", textAlign = TextAlign.Center, fontSize = 12.sp)
                    }
                })
                NavigationBarItem(selected = false, onClick = { /*TODO*/ }, icon = {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.share2),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize(.6f),
                            tint = Color.Black
                        )
                        Text(text = "Share", textAlign = TextAlign.Center, fontSize = 12.sp)
                    }
                })
            }
        }
    }
}