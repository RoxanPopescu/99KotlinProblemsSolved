package com.example.myapplication.pb16

/**
 *
 * P16 (*) Drop every Nth element from a list.
Example:

> drop(3, "abcdefghijk".toList())
[a, b, d, e, g, h, j, k]

take = returns a list containing first n elements
drop = returns a list containing all elements except the first
 */

// refactor to eliminate element at pos i (not i-1)

fun dropN(n: Int, list: List<Char>): List<Char> {
    var result = list.toMutableList()

    var index = 0
    var size= result.size

    while (index < size) {

        if ((index>0) && ((index+1) % n == 0) && (index+1<size)) {
            result.removeAt(index)
            size=-1
        }

        index += 1
    }
    return result
}

fun main() {

    val inputList = "abcdefghijk".toList()
    val n = 3

    println("Input  $inputList \n and drop every $n element")
    println("Output " + dropN(n, "abcdefghijk".toList())) // abc efg ijk
   // println("Output for emptylist is " + dropN(n, emptyList()))
}