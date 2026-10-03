package com.example.championselector.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.championselector.R
import com.example.championselector.data.Champion
import com.example.championselector.data.ChampionRepository

@Composable
fun ChampionListScreen(
    modifier: Modifier = Modifier
){
    val champions = ChampionRepository()
    LazyColumn(
        modifier = modifier.fillMaxWidth().padding(all = 8.dp)
    ) {
        items(
            items = champions.readAll(),
            key = {
                champion: Champion -> champion.id
            }
        ){
            champion -> ChampionItem(champion)
        }
    }
}

@Composable
fun ChampionItem(
    champion:Champion
){
    val image = when (champion.imageId) {
        1 -> R.drawable.champion_1
        2 -> R.drawable.champion_2
        3 -> R.drawable.champion_3
        4 -> R.drawable.champion_4
        5 -> R.drawable.champion_5
        6 -> R.drawable.champion_6
        7 -> R.drawable.champion_7
        8 -> R.drawable.champion_8
        9 -> R.drawable.champion_9
        10 -> R.drawable.champion_10
        11 -> R.drawable.champion_11
        12 -> R.drawable.champion_12
        else -> R.drawable.champion_1
    }
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = champion.name
        )
        Text(champion.name)
    }

}