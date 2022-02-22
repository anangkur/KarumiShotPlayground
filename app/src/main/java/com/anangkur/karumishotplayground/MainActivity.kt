package com.anangkur.karumishotplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.anangkur.karumishotplayground.ui.theme.KarumiShotPlaygroundTheme

class MainActivity : ComponentActivity() {

    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KarumiShotPlaygroundTheme {
                MainActivityScreen()
            }
        }
    }
}