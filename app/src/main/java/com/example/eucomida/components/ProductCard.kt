package com.example.eucomida.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.eucomida.R
import com.example.eucomida.data.ProductsData
import com.example.eucomida.ui.theme.EuComidaTheme

@Composable
fun ProductCard(modifier: Modifier = Modifier, product: ProductsData, removeItem: (ProductsData) -> Unit = {}, additem: (ProductsData) -> Unit = {}){
    EuComidaTheme() {
        Card(elevation = 6.dp) {
            Column(modifier = modifier.fillMaxHeight().padding(horizontal = 16.dp), horizontalAlignment = Alignment.CenterHorizontally){
                Image(painter = painterResource(id = product.imageId), contentDescription = "", Modifier.size(80.dp))
                Text(product.productName, fontWeight = FontWeight.SemiBold)
                Text("$${product.productPrice.toString()}", fontWeight = FontWeight.SemiBold, color = MaterialTheme.colors.primary, modifier = Modifier.padding(vertical = 4.dp))
                Row(verticalAlignment = Alignment.CenterVertically){
                    IconButton(onClick = {
                        product.quantity--
                        removeItem
                    }) {
                        Icon(imageVector = Icons.Filled.Remove, contentDescription = "Remover")
                    }
                    Text(product.quantity.toString(), modifier = Modifier.border(1.dp, color = Color.LightGray, shape = MaterialTheme.shapes.medium).padding(vertical = 2.dp, horizontal = 8.dp))
                    IconButton(onClick = {
                        product.quantity++
                        additem
                    }) {
                        Icon(imageVector = Icons.Filled.Add, contentDescription = "Adicionar")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 300, heightDp = 300)
@Composable
fun previewProductCard(){
    Slot("Lorem Ipsum Dolor", modifier = Modifier.padding(32.dp)){
        ProductCard(product = ProductsData(productName = "Lorem ipsum", imageId =  R.drawable.ic_launcher_foreground, productPrice = 12, quantity = 0))
    }
}