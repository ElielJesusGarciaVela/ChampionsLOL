package com.example.championselector.data

class ChampionRepository {
    private val _champions = mutableListOf(
        Champion(1, "Annie"),
        Champion(2, "Fizz")
    )

    fun readAll():List<Champion> = _champions
}

data class Champion(
    val id: Int,
    val name: String
)