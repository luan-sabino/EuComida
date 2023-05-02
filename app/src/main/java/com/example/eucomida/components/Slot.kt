package com.example.eucomida.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ChevronRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.eucomida.ui.theme.EuComidaTheme

@Composable
fun Slot(
    title: String,
    modifier: Modifier = Modifier,
    onClickArrow: () -> Unit = {},
    content: @Composable () -> Unit = {}
){
    EuComidaTheme() {
        Column(modifier){
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)){
                Text(title, modifier = Modifier.padding(horizontal = 18.dp), fontWeight = FontWeight.SemiBold)
                IconButton(onClick = onClickArrow) {
                    Icon(imageVector = Icons.Outlined.ChevronRight, "Avançar", tint = MaterialTheme.colors.secondary)
                }
            }
            content()
        }
    }
}

@Preview
@Composable
fun previewSlot(){
    Slot("Lorem Ipsum Dolor")
}