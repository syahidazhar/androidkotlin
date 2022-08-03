package com.example.msyahidproject1_androidstudiointroduction

import kotlin.random.Random

object Game {

    private val rules = mapOf(
        "ROCK-SCISSORS" to true,
        "ROCK-PAPER" to false,
        "SCISSORS-PAPER" to true,
        "SCISSORS-ROCK" to false,
        "PAPER-ROCK" to true,
        "PAPER-SCISSORS" to false,
    )

    private val options = listOf("ROCK", "SCISSORS", "PAPER")

    private val optionDrawable = mapOf(
        "ROCK" to R.drawable.germany,
        "SCISSORS" to R.drawable.soviet,
        "PAPER" to R.drawable.us,
    )

    fun pickRandomOption(): String = options[Random.nextInt(0, 3)]

    fun pickDrawable(option: String): Int = optionDrawable[option]!!

    fun isDraw(from: String, to: String): Boolean = from == to

    fun isWin(from: String, to: String): Boolean = rules["$from-$to"]!!

}