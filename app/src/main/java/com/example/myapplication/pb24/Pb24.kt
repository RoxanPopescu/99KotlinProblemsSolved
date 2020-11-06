package com.example.myapplication.pb24

import kotlin.random.Random


/**
 * P24 (*) Lotto: Draw N different random numbers from the set 1..M.
Make sure there is a way to produce deterministic results. Example:

> lotto(3, 49)
[32, 28, 8]
 */

fun lotto(n: Int, list: List<Int>, random: Random): List<Int> =
    if (n == 0) emptyList()
    else {
        val value = list[random.nextInt(list.size)]
        lotto(n - 1, list.filter { it != value }, random) + value
    }

fun main() {

    val N = 3
    val M = 49
    val list = (1..M).toList()

    println(" Draw $N different  selected elements from the above set 1 .. $M ")
    val result = lotto(N, list, Random(123))

    println(" List is $result)")
}