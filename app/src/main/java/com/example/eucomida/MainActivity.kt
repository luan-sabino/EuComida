package com.example.eucomida

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.eucomida.components.*
import com.example.eucomida.ui.theme.EuComidaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EuComidaApp()
        }
    }
}

@Preview
@Composable
fun EuComidaApp(){
    EuComidaTheme {
        var isLogged by remember { mutableStateOf(false) }
        val navController = rememberNavController()
        val currentBackStack by navController.currentBackStackEntryAsState()
        val currentDestination = currentBackStack?.destination
        val currentScreen = euComidaTabRowScreens.find { it.route == currentDestination?.route } ?: Shop
        Scaffold(
            bottomBar = {
                if(isLogged){
                    EuComidaTabRow(
                        allScreens = euComidaTabRowScreens,
                        onTabSelected = { screen -> navController.navigateSingleTopTo(screen.route) },
                        currentScreen = currentScreen
                    )
                }
            },
        ) {
            NavHost(
                navController = navController,
                startDestination = if(isLogged) Shop.route else Welcome.route,
                modifier = Modifier.padding(it)
            ){
                composable(route = Welcome.route){
                    Welcome(
                        onClickContinue = {navController.navigateSingleTopTo(SignUp.route)}
                    )
                }
                composable(route = SignUp.route){
                    SignUp(
                        onClickSignUp = {
                            navController.navigateSingleTopTo(Shop.route)
                            isLogged = true
                        }
                    )
                }
                composable(route = Shop.route){
                    Shop(
                        onClickSeeAllCategories = { navController.navigateToSingeAllCategories() }
                    )
                }
                composable(route = Search.route){
                    //Search()
                }
                composable(route = Account.route){
                    //Account()
                }
                composable(route = Cart.route){
                    //Cart()
                }
                composable(route = Settings.route){
                    //Settings()
                }
                composable(route = Categories.route){
                    Categories(
                        onClickGoBack = {navController.popBackStack()}
                    )
                }
            }
        }
    }
}

fun NavHostController.navigateSingleTopTo(route: String) =
    this.navigate(route) { launchSingleTop = true }

fun NavHostController.navigateToSingeAllCategories() =
    this.navigateSingleTopTo("${Categories.route}")