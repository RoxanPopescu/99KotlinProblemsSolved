package com.example.p014

/**
 * P14 (*) Duplicate the elements of a list.
 * Example:

> duplicate("abccd".toList())
[a, a, b, b, c, c, c, c, d, d] */

fun duplicate(list: List<Char>): List<Char> = list.flatMap { listOf(it, it) }

fun main() {
    val inputList = "abccd".toList()

    println("The inputlist is : $inputList")
    println("The list with duplicates is : " + duplicate(inputList))
    println("The output list for an emptylist is:" + duplicate(emptyList()))
}