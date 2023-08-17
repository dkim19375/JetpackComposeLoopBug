package me.dkim19375.jetpackcomposeloopbug

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            for (i in 1..1) { // can be any loop
                if (false) { // or if (true), or if (anything)
                    Box(modifier = Modifier) // should work with any Composable, including custom ones
                    continue
                }

                Box(modifier = Modifier)
            }
        }
    }
}