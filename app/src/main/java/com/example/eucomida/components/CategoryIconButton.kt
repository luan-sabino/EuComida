package com.example.eucomida.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
 import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CategoryIconButton(text: String, iconVector: ImageVector, modifier: Modifier = Modifier, backgroundColor: Color = Color.Green, callback: () -> Unit = {}){
    Button(
        onClick = callback,
        colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor),
        elevation = ButtonDefaults.elevation(6.dp)
    ){
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier) {
            Icon(imageVector = iconVector, contentDescription = "", modifier = Modifier.size(64.dp), tint = Color.White)
            Text(text, fontSize = 16.sp, color = Color.White)
        }
    }
}

@Preview
@Composable
fun previewIconButton(){
    CategoryIconButton("Lorem Ipsum",Icons.Outlined.Email)
}