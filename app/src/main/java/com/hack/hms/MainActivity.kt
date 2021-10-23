package com.hack.hms

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hack.hms.features.home.Home
import com.hack.hms.features.messaging.Messaging
import com.hack.hms.features.registration.Registration
import com.hack.hms.ui.theme.HmsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HmsTheme {
                Surface(color = MaterialTheme.colors.background) {
                    val controller = rememberNavController()

                    NavHost(navController = controller, startDestination = "home") {
                        composable("home") { Home(controller) }
                        composable("messaging") { Messaging(controller) }
                        composable("registration"){ Registration(controller) }
                    }
                }
            }
        }
    }
}
