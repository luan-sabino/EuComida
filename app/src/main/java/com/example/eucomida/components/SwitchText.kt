package com.example.eucomida.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.eucomida.ui.theme.EuComidaTheme
import com.example.eucomida.ui.theme.Red200

@Composable
fun SwitchText(checked: Boolean, label: String, modifier: Modifier = Modifier, onCheckedChange: (Boolean) -> Unit){
    Row(modifier = modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Switch(checked = checked, onCheckedChange = onCheckedChange, modifier =  Modifier
            .padding(end = 24.dp)
            .scale(1.2f), colors = SwitchDefaults.colors(checkedTrackColor = Red200, checkedThumbColor = Color.White)
        )
        Text(label, fontWeight = FontWeight.Bold)
    }
}

@Preview
@Composable
fun previewSwitchText(){
    var checked by remember { mutableStateOf(false) }
    EuComidaTheme {
        SwitchText(checked, "Lorem Ipsum Dolor"){it -> checked = it}
    }
}
