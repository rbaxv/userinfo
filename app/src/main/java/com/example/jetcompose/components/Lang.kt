package com.example.infoapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetcompose.Navigation.Screen


@Composable
fun Lang(
    navController: NavController
) {
    Spacer(modifier = Modifier.height(2.dp))

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 5.dp, top = 10.dp, bottom = 0.dp)
    ) {
        Text(text = "Language: ", color = Color.Blue, modifier = Modifier.padding(start = 20.dp))

        LazyRow {
            val programmingLanguages =
                listOf("C and C++", "Python ", "Java ", "Kotlin ", "Flutter ")

            for (language in programmingLanguages) {
                item {
                    Button(
                        onClick = {
                            navController.navigate(Screen.LangPage.withArgs(language))
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF0000FF).copy(
                                0.8f
                            )
                        ),
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .padding(15.dp)
                    ) {
                        Text(text = language, color = Color.White)
                    }
                }
            }
        }
    }
}