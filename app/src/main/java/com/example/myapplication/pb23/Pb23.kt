package com.example.myapplication.pb23

import kotlin.random.Random

/**
 * P23 (*) Extract a given number of randomly selected elements from a list.
Make sure there is a way to produce deterministic results. Example:

> randomSelect(3, "abcdefgh".toList())
[c, h, f]
 */

fun extractRandom(givenNr: Int, list: List<Char>, random: Random): List<Char> =

    if (givenNr == 0) emptyList()
    else {
        val value = list[random.nextInt(list.size)]
        extractRandom(givenNr - 1, list.filter { it != value }, random) + value
    }

fun main() {

    val list = "abcdefgh".toList()
    val givenNr = 3
    println(list)
    println(" Extract a given number of $givenNr randomly selected elements from the above list ")
    val result = extractRandom(givenNr, list, Random(123))

    println(" List is $result)")
}