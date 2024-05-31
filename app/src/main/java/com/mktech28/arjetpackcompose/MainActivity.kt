package com.mktech28.arjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.mktech28.arjetpackcompose.ui.login_signup.LoginScreen
import com.mktech28.arjetpackcompose.ui.theme.ARJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ARJetpackComposeTheme {
                MyApp()
            }

        }
    }
}

@Composable
fun MyApp() {
   LoginScreen()
}

