package com.example.eucomida.data

import com.example.eucomida.R

data class ProductsData(
    val imageId: Int,
    val productName: String,
    val productPrice: Int,
    var quantity: Int = 0
)

var beers = listOf(
    ProductsData(R.drawable.ic_launcher_foreground, "Lorem ipsum", 12),
    ProductsData(R.drawable.ic_launcher_foreground, "Lorem ipsum", 12),
)

var pastas = listOf(
    ProductsData(R.drawable.ic_launcher_foreground, "Lorem ipsum", 12),
    ProductsData(R.drawable.ic_launcher_foreground, "Lorem ipsum", 12),
)

var fastfood = listOf(
    ProductsData(R.drawable.ic_launcher_foreground, "Lorem ipsum", 12),
    ProductsData(R.drawable.ic_launcher_foreground, "Lorem ipsum", 12),
)