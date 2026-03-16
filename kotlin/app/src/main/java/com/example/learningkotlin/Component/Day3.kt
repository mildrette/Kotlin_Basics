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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Day3(){
    val boss:String? = "123456789"
    val favour:String? = null
    val favourLength = favour?.length

    Column(  modifier = Modifier.padding(20.dp)
        .fillMaxSize()
        .background(Color.White)) {
        Text("Boss: $boss ")
        Spacer(modifier = Modifier.padding(10.dp))
        Text("Favour : $favour ")
        Spacer(modifier = Modifier.padding(10.dp))
        Text("Favour length : $favourLength ")
        Spacer(modifier = Modifier.padding(10.dp))
        Text("is Favour's number empty?? ${favour == null}", color = Color.Red,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.padding(10.dp))
        Column {
            phoneNumberValidation()
        }
    }

}

@Composable
fun phoneNumberValidation(){
    val phoneNumber:String? = "+237674000000"
    val numberMessage = if(phoneNumber == null){
        "No number Entered"
    } else if(phoneNumber.length != 9){
        "invalid! cameroon numbers need 9 digits, you Entered ${phoneNumber.length}"
    } else {"Valid Number!"}

    Column {
Text(numberMessage, color = Color.Gray, fontWeight = FontWeight.Bold)
    }
}


@Preview
@Composable
fun Day3Preview(){
    Day3()
}