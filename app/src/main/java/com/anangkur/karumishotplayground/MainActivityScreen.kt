package com.anangkur.karumishotplayground

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@ExperimentalFoundationApi
@Composable
fun MainActivityScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = stringResource(id = R.string.app_name))
                },
            )
        },
        content = {
            Column {
                ProfileSection()
                PostsSection()
            }
        },
    )
}

@Composable
private fun ProfileSection() {
    Column(modifier = Modifier.padding(20.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(100.dp))
                    .size(100.dp)
                    .background(color = Color.Gray)
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(text = "0")
                Text(text = "Posts", fontSize = 12.sp)
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(text = "0")
                Text(text = "Followers", fontSize = 12.sp)
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(text = "0")
                Text(text = "Following", fontSize = 12.sp)
            }
        }
        Text(
            modifier = Modifier.padding(top = 10.dp),
            text = "Name"
        )
        Text(text = "Description")
        Button(
            modifier = Modifier.padding(top = 10.dp),
            onClick = {},
        ) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(modifier = Modifier.padding(vertical = 10.dp), text = "Edit Profile")
            }
        }
    }
}

@ExperimentalFoundationApi
@Composable
private fun PostsSection() {
    LazyVerticalGrid(
        cells = GridCells.Fixed(3),
        content = {
            items(100) {
                Post()
            }
        }
    )
}

@Composable
private fun Post() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(4.dp)
            .background(color = Color.Gray)
    )
}

@Preview
@Composable
private fun PreviewProfileSection() {
    Box(Modifier.background(color = Color.White)) {
        ProfileSection()
    }
}

@ExperimentalFoundationApi
@Preview
@Composable
private fun PreviewPostsSection() {
    Box(modifier = Modifier.background(color = Color.White)) {
        PostsSection()
    }
}

@ExperimentalFoundationApi
@Preview
@Composable
private fun PreviewMainActivityScreen() {
    MainActivityScreen()
}