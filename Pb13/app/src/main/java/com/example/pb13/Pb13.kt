package com.example.pb13

/**
 * P13 (*) Run-length encoding of a list (direct solution).
Implement the so-called run-length encoding data compression method directly.
I.e. don't use other methods you've written (like P09's pack); do all the work directly.
Example:

> encodeDirect("aaaabccaadeeee".toList())
[(4, a), (1, b), (2, c), (2, a), (1, d), (4, e)]
 */

fun <T> encodeDirect(list: List<T>): List<Pair<Int, T>> {
    val n: Int = list.size
    val result = mutableListOf<Pair<Int, T>>()

    var i = 0
    while (i < n) {
        // Count occurrences of current character
        var count = 1
        while (i < n - 1 &&
            list.elementAt(i) === list.elementAt(i + 1)
        ) {
            count++
            i++
        }
        // Print character and its count
        result.add(Pair(count, list.elementAt(i)))
        print("($count,${list[i]}), ")
        i++
    }
    return result
}

fun main() {
    encodeDirect("aaaabccaadeeee".toList()).toString()
}



