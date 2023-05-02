package com.example.eucomida.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.eucomida.ui.theme.Red200

@Composable
fun TextInput(label: String, value: TextFieldValue, modifier: Modifier = Modifier, onValueChange: (TextFieldValue) -> Unit){
    Column(modifier = modifier.fillMaxWidth()){
        Text(label, modifier = Modifier.padding(vertical = 8.dp), fontWeight = FontWeight.Bold)
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = value,
            onValueChange = onValueChange,
            colors = TextFieldDefaults.textFieldColors(focusedIndicatorColor = Red200, cursorColor = Red200, backgroundColor = MaterialTheme.colors.background)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun previewTextInput(){
    var text by remember { mutableStateOf(TextFieldValue("")) }
    fun onValueChange(value: TextFieldValue){
        text = value
    }
    TextInput("Lorem Ipsum", text, onValueChange = ::onValueChange)
}