package com.example.jetcompose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LangPage(
    navController: NavController,
    name: String = "Language name"
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("$name", fontWeight = FontWeight.Bold)
                },

                navigationIcon = {
                    // Back icon to navigate back to HomePage
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null, // handle contentDescription as needed
                        modifier = Modifier
                            .padding(8.dp)
                            .clickable {
                                navController.popBackStack()
                            }
                    )
                },
            )
        }
    ) {
        it
        Box(modifier = Modifier.background(Color.Blue))
    }
}