package com.example.eucomida.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eucomida.R

@Composable
fun Welcome(
    onClickContinue: () -> Unit = {}
){
    Surface(){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.welcome_page),
                contentDescription = "Comidas",
                modifier = Modifier.size(512.dp))
            Spacer(modifier = Modifier.height(90.dp).fillMaxWidth())
            Button(
                content = {
                      Text("Continuar", fontSize = 36.sp)
                },
                modifier = Modifier.fillMaxWidth(0.8f),
                onClick = onClickContinue
            )
            Spacer(modifier = Modifier.height(20.dp).fillMaxWidth())
            Text("Entrar com a minha conta", fontSize = 18.sp)
            Spacer(modifier = Modifier.height(20.dp).fillMaxWidth())
            Text("EuComidas", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Preview
@Composable()
fun previewWelcome(){
    Welcome()
}