package com.example.myapplication.pb03

/**
 *
 * P03 (*) Find the Nth element of a list.
  By convention, the first element in the list is element 0.
Example:
> nth(2, listOf(1, 1, 2, 3, 5, 8))
 2
 */

fun nthElement(list: List<Int>, n: Int): Int {
    return if (list.isEmpty() || list.size < n || n <= 0) {
        -1
    } else {
        list[n - 1]
    }
}

fun nthElement2(list: List<Int>, n: Int): Int {
    return list.elementAtOrNull(n) ?: -1
}

fun main() {
    println(" Find the Nth element of a list: " + nthElement2(listOf(1, 1, 2, 3, 5, 8), -43))
}