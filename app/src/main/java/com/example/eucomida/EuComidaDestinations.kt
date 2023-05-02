package com.example.eucomida

import com.example.eucomida.components.Categories
import com.example.eucomida.components.Shop
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

interface EuComidaDestinations {
    val icon: ImageVector
    val route: String
}

object Shop : EuComidaDestinations {
    override val icon = Icons.Filled.Storefront
    override val route = "Loja"
}

object Settings : EuComidaDestinations {
    override val icon = Icons.Filled.Settings
    override val route = "Opções"
}

object Cart : EuComidaDestinations {
    override val icon = Icons.Filled.ShoppingBag
    override val route = "Carrinho"
}

object Search : EuComidaDestinations {
    override val icon = Icons.Filled.Search
    override val route = "Buscar"
}

object Account : EuComidaDestinations {
    override val icon = Icons.Filled.Person
    override val route = "Conta"
}

object Categories : EuComidaDestinations {
    override val icon = Icons.Filled.Category
    override val route = "Categorias"
}

object Welcome : EuComidaDestinations {
    override val icon = Icons.Filled.Category
    override val route = "Welcome"
}

object SignUp : EuComidaDestinations {
    override val icon = Icons.Filled.Category
    override val route = "Signup"
}

val euComidaTabRowScreens = listOf(Shop, Search, Account, Cart, Settings)
