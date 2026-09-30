package com.example.championselector.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.championselector.R
import com.example.championselector.data.Champion
import com.example.championselector.data.ChampionRepository

@Composable
fun ChampionListScreen
            (modifier: Modifier = Modifier
){
    val champions = ChampionRepository()
    LazyColumn(
        modifier = modifier.fillMaxWidth().padding(all = 8.dp)
    ) {
        items(
            items = champions.readAll(),
            key = {
                champion: Champion ->
                    champion.id
            }
        ){
            champion ->
                ChampionItem(champion)
        }
    }
}

@Composable
fun ChampionItem(
    champion:Champion
){
    Text(champion.name)
}

@Composable
@Preview
fun ChampionItemPreview(

){
    val annie = Champion(1,"Annie")
    Text(annie.name)
}
