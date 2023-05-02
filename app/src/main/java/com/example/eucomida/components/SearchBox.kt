package com.example.eucomida.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.eucomida.ui.theme.EuComidaTheme
import org.w3c.dom.Text

@Composable
fun SearchBox(value: TextFieldValue, modifier: Modifier = Modifier, onValueChange: (TextFieldValue) -> Unit){
    EuComidaTheme() {
        Surface(
            elevation = 12.dp,
            shape = RoundedCornerShape(topStartPercent = 0, topEndPercent = 0, bottomEndPercent = 16, bottomStartPercent = 16),
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp, bottom = 16.dp, start = 8.dp, end = 8.dp), verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = "Procurar",
                    tint = MaterialTheme.colors.secondary,
                    modifier = Modifier.size(36.dp)
                )
                TextField(
                    singleLine = true,
                    value = value,
                    onValueChange = onValueChange,
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent
                    ),
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {Text("O que você quer comer hoje?")})
            }
        }
    }
}

@Preview
@Composable
fun previewSearchBox(){
    var value by remember { mutableStateOf(TextFieldValue("")) }
    SearchBox(value){it -> value = it}
}