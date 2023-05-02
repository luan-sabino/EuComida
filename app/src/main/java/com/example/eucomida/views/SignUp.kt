package com.example.eucomida.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eucomida.ui.theme.EuComidaTheme

@Composable
fun SignUp(
    onClickSignUp: () -> Unit = {}
){

    var nameField by remember { mutableStateOf(TextFieldValue("")) }
    var emailField by remember { mutableStateOf(TextFieldValue("")) }
    var passwordField by remember { mutableStateOf(TextFieldValue("")) }
    var switchButton by remember { mutableStateOf(false) }

    EuComidaTheme{
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colors.primary)){
                    Text("Bem vindo ao EuComida", fontWeight = FontWeight.Medium, fontSize = 24.sp, color = Color.White, modifier = Modifier.padding(top = 24.dp, bottom = 12.dp))
                    Text("Cadastro", fontWeight = FontWeight.Bold, fontSize = 28.sp, color = Color.White, modifier = Modifier.padding(bottom = 32.dp))
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp, vertical = 12.dp)
                ){
                    TextInput(label = "Name", value = nameField){field -> nameField = field}
                    TextInput(label = "Email", value = emailField, modifier = Modifier.padding(top = 24.dp)){field -> emailField = field}
                    TextInput(label = "Password", value = passwordField, modifier = Modifier.padding(top = 24.dp)){field -> passwordField = field}
                    SwitchText(checked = switchButton, label = "Receber Promoções", modifier = Modifier.padding(top = 24.dp)){field -> switchButton = field}
                    Button(
                        content = {
                            Text("Cadastrar", fontSize = 36.sp)
                        },
                        onClick = onClickSignUp,
                        modifier = Modifier.padding(top = 64.dp).fillMaxWidth(0.6f),
                        colors =  ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.secondary)
                    )
                    TextButton(
                        content = {Text("Lorem ipsum dolor sit amet?", color = Color.Gray)},
                        onClick = {},
                        modifier = Modifier.padding(top = 16.dp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun previewSignUp(){
    SignUp()
}