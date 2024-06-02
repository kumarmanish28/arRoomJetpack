package com.mktech28.arjetpackcompose.ui.bottom_nav

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.mktech28.arjetpackcompose.ui.home.HomeScreen
import com.mktech28.arjetpackcompose.ui.ProductCartScreen
import com.mktech28.arjetpackcompose.ui.ProfileSettingScreen
import com.mktech28.arjetpackcompose.ui.SearchProductScreen


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BottomNavigationFun() {

    val listOfBottomNav = listOf("HOME", "SEARCH", "CART", "PROFILE")

    var selectedScreen by remember { mutableStateOf(listOfBottomNav.first()) }

    Scaffold(
        bottomBar = {
            NavigationBar {
                listOfBottomNav.forEach { screen ->
                    NavigationBarItem(
                        icon = { Icon(getIconForScreen(screen), contentDescription = screen) },
//                        label = { Text(screen) },
                        selected = screen == selectedScreen,
                        onClick = { selectedScreen = screen },
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        },
        content = {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                when (selectedScreen) {
                    "HOME" -> HomeScreen()
                    "SEARCH" -> SearchProductScreen()
                    "CART" -> ProductCartScreen()
                    "PROFILE" -> ProfileSettingScreen()
                    else -> HomeScreen()
                }
            }
        }
    )
}

@Composable
fun getIconForScreen(screen: String): ImageVector {
    return when (screen) {
        "HOME" -> Icons.Default.Home
        "SEARCH" -> Icons.Default.Search
        "CART" -> Icons.Default.ShoppingCart
        "PROFILE" -> Icons.Default.Person
        else -> Icons.Default.Home
    }
}


