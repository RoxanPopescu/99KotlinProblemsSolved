package com.example.pb2

/**
 * P02 (*) Find the last but one element of a list.
 */

fun <T> lastButOne(list: List<T>): T = list[list.lastIndex - 1]

fun main() {
    println(listOf(1, 1, 2, 3, 5, 8))
    println(" last but one element of the list is : " + lastButOne(listOf(1, 1, 2, 3, 5, 8)))
}

