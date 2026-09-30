package com.example.lolchampions.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.lolchampions.R

import com.example.lolchampions.data.Champion
import com.example.lolchampions.data.ChampionRepository

@Composable
fun ChampionListScreen(
    modifier: Modifier = Modifier
) {

    val championsRepository = ChampionRepository()

    LazyColumn(
        modifier = modifier
    ) {
        items(
            items = championsRepository.champion,
            key = {
                champion: Champion -> champion.id
            },
        ){
            champion ->
                ChampionItem(champion)
        }
    }
}

@Composable
fun ChampionItem(
    champion: Champion
) {
    Image(painterResource(R.drawable.annie), "foto annie")
    Text(champion.name)
}

@Composable
@Preview
fun ChampionItemPreview(){
    val annie = Champion(1, "annie")
    Text(annie.name)
}