package com.example.learningkotlin.Component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Day2(){
    val name: String = "Mildred"
    var age:Int = 30
    age = 31
    val income:Double = 100000.0
    val isLearning:Boolean = true
    val hasPaidRent: Boolean = false

    Column(
        modifier = Modifier.padding(20.dp)
            .fillMaxSize()
            .background(Color.White)
    ) {
        Text(buildAnnotatedString {
            append("i will be ")
            withStyle(
                style = SpanStyle(
                    color = Color.Green,
                    fontWeight = FontWeight.Bold
                )
            )
            {
                append("$age")
            }
            append("Tomorrow, ")
            withStyle(style = SpanStyle(
                color = Color.Red,
                fontWeight = FontWeight.Thin,
                fontSize = 30.sp
            ))
            {
                append("It's my Birthday")
            }

      })
        Spacer(modifier = Modifier.padding(10.dp))

        Text("My name is $name")
        Spacer(modifier = Modifier.padding(10.dp))

        Text("If i learn and master kotlin i will start earning $income by month")
        Spacer(modifier = Modifier.padding(10.dp))

        Text("am i currently learning to make that dream to earn $income real?? $isLearning")
        Spacer(modifier = Modifier.padding(10.dp))

        Text("Have i paid my rent for last month and this month?? $hasPaidRent")
        
    }
}

@Preview
@Composable
fun Day2Preview(){
    Day2()
}