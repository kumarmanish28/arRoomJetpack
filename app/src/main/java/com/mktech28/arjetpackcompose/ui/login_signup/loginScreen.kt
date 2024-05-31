package com.mktech28.arjetpackcompose.ui.login_signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mktech28.arjetpackcompose.R

@Composable
fun LoginScreen() {
    Image(
        painter = painterResource(R.drawable.blury_background),
        contentDescription = "background_image",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )


    Column(
        modifier = Modifier.padding(30.dp, 100.dp, 30.dp, 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row {

            Image(
                painter = painterResource(R.drawable.ar_2),
                contentDescription = "room_image",
                modifier = Modifier.size(36.dp)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = "ARoom",
                style = MaterialTheme.typography.headlineMedium,
                fontFamily = FontFamily.SansSerif
            )

        }

        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = "Furnish your reality with ARoom",
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.SansSerif
        )
        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "Bring your dream home to life with our app, where you can visualize and place furniture in your space with ease and confidence",
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(100.dp))

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .width(200.dp)
                .height(52.dp)
        ) {
            Text(text = "Register", fontSize = 16.sp, fontFamily = FontFamily.SansSerif)
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .width(200.dp)
                .height(52.dp)
        ) {
            Text(text = "Login", fontSize = 16.sp, fontFamily = FontFamily.SansSerif)
        }

    }
}

@Composable
@Preview
fun PreviewFun() {
    LoginScreen()
}