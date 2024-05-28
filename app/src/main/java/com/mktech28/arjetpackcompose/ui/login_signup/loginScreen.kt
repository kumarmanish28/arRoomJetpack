package com.mktech28.arjetpackcompose.ui.login_signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.mktech28.arjetpackcompose.R

@Composable
fun LoginScreen() {
    Image(
        painter = painterResource(R.drawable.blury_background),
        contentDescription = "background_image",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )

}