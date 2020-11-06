package com.example.myapplication.pb22


/**
 * P22 (*) Create a list containing all integers within a given range.
Example:

> range(4, 9)
[4, 5, 6, 7, 8, 9]
 */

fun rangeListFrom(from: Int, to: Int): List<Int> {
    return if (from < to) (from..to).toList()
    else emptyList()
}

fun main() {

    val a = 4
    val b = 9

    println(" Create list containing all integers from  $a to $b ")
    val result = rangeListFrom(a, b)

    println(" List is $result)")

}