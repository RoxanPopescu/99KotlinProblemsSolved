package com.example.myapplication.pb20

import com.example.myapplication.pb18.slice_

/**
 * P20 (*) Remove the Kth element from a list.
Return the list and the removed element in a Tuple. Elements are numbered from 0. Example:
> removeAt(1, "abcd".toList())
([a, c, d], b)
 */

fun removeAt(k: Int, inputList: List<Char>): Pair<List<Char>, Char> {
    return if (k < 0 || k > inputList.size) {
        Pair(emptyList(), ' ')
    } else {
        Pair(slice_(0, k, inputList) + slice_(k + 1, inputList.size, inputList), inputList[k])
    }
}

fun main() {

    val list: List<Char> = "abcd".toList()
    val k = 2

    println(" removeAt the $k -th element from the list :$list")
    val result = removeAt(k - 1, list)

    if (result.first.isEmpty()) {
        println(" Result is an empty list, because k= $k which is less than list size ${list.size}")
    } else {
        println(" result is (${result.first}, ${result.second} )")
    }
}

