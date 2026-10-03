package com.example.championselector.data

data class Champion (
    val id:Int,
    val name:String,
    val imageId:Int,
)

class ChampionRepository {
    private val _champions = mutableListOf(
        Champion(1, "Annie",1),
        Champion(2, "Fizz",2),
        Champion(3, "Dianna",3),
        Champion(4, "Irelia",4),
        Champion(5, "Leona",5),
        Champion(6, "Mordekaiser",6),
        Champion(7, "Neeko",7),
        Champion(8, "Senna",8),
        Champion(9, "Taric",9),
        Champion(10, "Teemo",10),
        Champion(11, "Vi",11),
        Champion(12, "Ziggs",12),


    )

    fun readAll():List<Champion> = _champions
}

