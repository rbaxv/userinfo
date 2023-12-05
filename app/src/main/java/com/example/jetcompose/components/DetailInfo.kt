package com.example.jetcompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetcompose.R
import com.example.jetcompose.ui.theme.Secondary

@Composable
fun DetailInfo(){
    Column {


        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 18.dp, top = 15.dp)
//                .padding(start = 18.dp, top = 15.dp, bottom = 15.dp)
        ) {
            item {
//                This is the first Blue Box containing the Student details
                Box(
                    contentAlignment = Alignment.CenterStart,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(color = Secondary)
                        .height(240.dp)
                        .width(320.dp)
                        .padding(start = 15.dp, top = 0.dp, bottom = 10.dp, end = 15.dp)
                ) {
                    Column ()
                    {
                        Text(
                            text = "Course: B Tech",
                            style = MaterialTheme.typography.headlineSmall,
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Dob: 28/09/2004",
                            style = MaterialTheme.typography.headlineSmall,
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.height(4.dp))

                        Text(
                            text = "Contact No: 9605467063",
                            style = MaterialTheme.typography.headlineSmall,
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.height(4.dp))

                        Text(
                            text = "Valid upto: Jul 25",
                            style = MaterialTheme.typography.headlineSmall,
                            color = Color.White
                        )

                    }

                }
            }

            item {
                Spacer(modifier = Modifier.width(20.dp))
            }
            item {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(color = Secondary)
                        .height(240.dp)
                        .width(320.dp)
                        .padding(start = 15.dp, top = 0.dp, bottom = 10.dp, end = 15.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.img), contentDescription = "Qr Code",
                        modifier = Modifier.width(100.dp))
                }
            }

            item {
                Spacer(modifier = Modifier.width(20.dp))
            }

            item {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(color = Secondary)
                        .height(240.dp)
                        .width(320.dp)
                        .padding(start = 15.dp, top = 0.dp, bottom = 10.dp, end = 15.dp)
                ) {
                    Column {
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                    }
                }
            }

            item {
                Spacer(modifier = Modifier.width(20.dp))
            }
            item {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(color = Secondary)
                        .height(240.dp)
                        .width(320.dp)
                        .padding(start = 15.dp, top = 0.dp, bottom = 10.dp, end = 15.dp)
                ) {
                    Column {

                    }
                }
            }

            item {
                Spacer(modifier = Modifier.width(20.dp))
            }




        }
    }

}
@Composable
fun ContactBox (){
    Row(

        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color = Secondary.copy(0.8f))
            .padding(horizontal = 15.dp, vertical = 20.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(color = Secondary)

        )
        {
            Icon(
                Icons.Default.Call, contentDescription = "Call",
                tint = Color.White
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(color = Secondary)
        )
        {
            Icon(
                Icons.Default.Email, contentDescription = "Call",
                tint = Color.White
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(color = Secondary)
        )
        {
            Icon(
                Icons.Default.LocationOn, contentDescription = "Call",
                tint = Color.White
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(color = Secondary)
        )
        {
            Icon(
                Icons.Default.Share, contentDescription = "Call",
                tint = Color.White
            )
        }

    }
}
@Composable
fun Lang(

) {
//    Column {
//        Text(text = "Languages",
//            color = Color.Blue,
//            textAlign = TextAlign.Left,
//            modifier = Modifier.padding(start = 26.dp)
//
//        )
    Spacer(modifier = Modifier.height(2.dp))
    Column {

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 25.dp, top = 15.dp, bottom = 0.dp)
        ) {
            val programmingLanguages =
                listOf("C and C++ n", "Python n", "Java n", "Kotlin n", "Flutter n")
            item {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(color = Secondary)
                        .padding(15.dp)
                ) {
                    Text(text = "Language: ", color = Color.White)
                }
            }
            item {
                Spacer(modifier = Modifier.width(20.dp))
            }


    }}}


