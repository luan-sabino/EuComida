package com.example.eucomida.components

import android.widget.Space
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.eucomida.ui.theme.EuComidaTheme
import com.example.eucomida.data.categories
import com.example.eucomida.data.beers
import com.example.eucomida.data.pastas
import com.example.eucomida.data.fastfood

@Composable
fun Shop(
    onClickSeeAllCategories: () -> Unit = {}
){
    var searchContent by remember { mutableStateOf(TextFieldValue("")) }

    var pastas = pastas.toMutableStateList()
    var beers = beers.toMutableStateList()
    var fastfood = fastfood.toMutableStateList()

    val columnState = rememberScrollState()

    EuComidaTheme() {
        Surface() {
            Column() {
                SearchBox(value = searchContent){it -> searchContent = it}
                Column(
                    Modifier
                        .fillMaxSize().verticalScroll(columnState)) {
                    Slot(title = "Categorias", onClickArrow = onClickSeeAllCategories, content = {
                        LazyRow(
                            horizontalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            item{
                                Spacer(Modifier.width(24.dp))
                            }
                            items(categories){
                                CategoryIconButton(text = it.desctiption, iconVector = it.iconVector, backgroundColor = it.color)
                            }
                            item{
                                Spacer(Modifier.width(24.dp))
                            }
                        }
                    })
                    Slot(title = "Macarrões", content = {
                        Row(
                            Modifier
                                .height(210.dp)
                                .fillMaxWidth()
                                .padding(vertical = 12.dp, horizontal = 8.dp), horizontalArrangement = Arrangement.SpaceAround){
                            pastas.forEach{item ->
                                ProductCard(
                                    product = item,
                                    additem = {item.quantity++},
                                    removeItem = {item.quantity--}
                                )
                            }
                        }
                    })
                    Slot(title = "Cervejas", content = {
                        Row(
                            Modifier
                                .height(210.dp)
                                .fillMaxWidth()
                                .padding(vertical = 12.dp, horizontal = 8.dp), horizontalArrangement = Arrangement.SpaceAround){
                            beers.forEach{item ->
                                ProductCard(
                                    product = item,
                                    additem = {item.quantity++},
                                    removeItem = {item.quantity--}
                                )
                            }
                        }
                    })
                    Slot(title = "Lanches", content = {
                        Row(
                            Modifier
                                .height(210.dp)
                                .fillMaxWidth()
                                .padding(vertical = 12.dp, horizontal = 8.dp), horizontalArrangement = Arrangement.SpaceAround){
                            fastfood.forEach{ item ->
                                ProductCard(
                                    product = item,
                                    additem = {item.quantity++},
                                    removeItem = {item.quantity--}
                                )
                            }
                        }
                    })
                }
            }
        }
    }
}

@Preview
@Composable
fun previewShop(){
    Shop()
}