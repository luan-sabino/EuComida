package com.example.eucomida.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector


data class CategoriesData(
    val iconVector: ImageVector,
    val desctiption: String,
    val color: Color
)

val categories = listOf(
    CategoriesData(Icons.Outlined.Coffee, "Cafés", color = Color.Cyan),
    CategoriesData(Icons.Outlined.LocalPizza, "Pizzas", color = Color.Black),
    CategoriesData(Icons.Outlined.WineBar, "Vinhos", color = Color.Green),
    CategoriesData(Icons.Outlined.SportsBar, "Cervejas", color = Color.Blue),
    CategoriesData(Icons.Outlined.LunchDining, "Lanches", color = Color.Magenta),
    CategoriesData(Icons.Outlined.Icecream, "Sorvetes", color = Color.Red),
    CategoriesData(Icons.Outlined.RamenDining, "Japones", color = Color.Yellow),
    CategoriesData(Icons.Outlined.KebabDining, "Espetinhos", color = Color.Gray),
    CategoriesData(Icons.Outlined.SoupKitchen, "Sopas", color = Color.DarkGray),
)