package com.example.myapplication.pb21

/**
 * P21 (*) Insert an element at a given position into a list.
Example:

> insertAt('X', 1, "abcd".toList())
[a, X, b, c, d]
 */

fun insertAt(char: Char,k: Int, inputList: List<Char>) =
    inputList.take(k).plus(char).plus(inputList.drop(k))

fun main() {

    val list: List<Char> = "abcd".toList()
    val k = 1
    val char = 'X'

    println(" Insert element $char at position $k in the list :$list")
    val result = insertAt(char,k, list)

    println(" result is $result)")

}