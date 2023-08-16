package me.dkim19375.jetpackcomposeloopbug

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Testing()
        }
    }
}

@Composable
fun Testing() {
    for (i in 1..1) {
        if (false) { // or if (true), or if (anything)
            Box(modifier = Modifier)
            continue
        }

        Box(modifier = Modifier)
    }
}