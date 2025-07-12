package com.pingfixer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.pingfixer.ui.PingReducerUI
import com.pingfixer.ui.theme.PingFixerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PingFixerTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    PingReducerUI()
                }
            }
        }
    }
}
