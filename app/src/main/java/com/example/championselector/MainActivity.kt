package com.example.championselector

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.championselector.data.ChampionRepository
import com.example.championselector.ui.ChampionListScreen
import com.example.championselector.ui.theme.ChampionSelectorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChampionSelectorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ChampionListScreen(
                        modifier = Modifier
                            .consumeWindowInsets( innerPadding)
                            .padding( innerPadding)
                    )
                }
            }
        }
    }
}
