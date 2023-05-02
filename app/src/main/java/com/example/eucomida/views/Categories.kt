package com.example.eucomida.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.eucomida.data.categories
import com.example.eucomida.ui.theme.EuComidaTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Categories(
    onClickGoBack: () -> Unit = {}
){

    EuComidaTheme() {
        Surface(modifier = Modifier.fillMaxSize()){
            Column(modifier = Modifier.fillMaxSize()){
                TopAppBar(
                    title = {Text("Categorias")},
                    navigationIcon = {
                        IconButton(onClick = onClickGoBack) {
                            Icon(Icons.Filled.ArrowBack, "Voltar")
                        }
                    }
                )

                LazyVerticalGrid(
                    GridCells.Fixed(2),
                    contentPadding = PaddingValues(vertical = 16.dp, horizontal = 36.dp),
                    horizontalArrangement = Arrangement.spacedBy(36.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ){
                    items(categories){
                        CategoryIconButton(text = it.desctiption, iconVector = it.iconVector, backgroundColor = it.color, modifier = Modifier.padding(vertical = 32.dp))
                    }
                }
            }
        }
    }
}


@Preview
@Composable
fun previewCategories(){
    Categories()
}