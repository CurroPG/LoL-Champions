package com.example.lolchampions.data

class ChampionRepository {
    private val _champion = mutableListOf(
        Champion(1, "Annie"),
        Champion(2, "Fizz")
    )

    val champion: List<Champion>
        get() =
            _champion.toList()

    //fun readAll(): List<Champion> = _champion
}

data class Champion(
    val id: Int,
    val name: String,
)