package com.example.learningkotlin.Component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Home(){
val myName = "mildred"
    val myGoals = "i am Learning Kotlin so i can become an Android Developer"
    var myAge = 30
    myAge = 31

    Column(
        modifier = Modifier.fillMaxSize()
            .fillMaxWidth()
            .padding(16.dp)
    ) {

   Text("Hello World! My Name is $myName and i am $myAge years old")

        Spacer(modifier = Modifier.padding(16.dp))
        Text(myGoals)
    }
}


@Preview(showBackground = true)
@Composable
fun HomePreview() {
      Home()
}