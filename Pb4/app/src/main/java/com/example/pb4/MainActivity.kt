package com.example.pb4

/**
 * P04 (*) Find the number of elements of a list.
 * */
fun <T> List<T>.tail(): List<T> = drop(1)

fun <T> nrOfElements(list: List<T>): Int {
    return if (list.isEmpty()) 0
    else 1 + nrOfElements(list.tail())
}

fun main() {
    println(listOf(1, 1, 2, 3, 4, 7, 9, 90))
    println(" The nr of elements in list is :" + nrOfElements(listOf(1, 1, 2, 3, 4, 7, 9, 90)))
}

