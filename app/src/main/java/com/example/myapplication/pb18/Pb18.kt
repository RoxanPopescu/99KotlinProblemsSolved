package com.example.myapplication.pb18

/**
 * P18 (*) Extract a slice from a list.
Given two indices, I and K, the slice is the list containing the elements from and including
the Ith element up to but not including the Kth element of the original list.
Start counting the elements with 0. Example:

> slice(3, 7, "abcdefghijk".toList())
[d, e, f, g]
 */

fun <T> sliceList(I: Int, K: Int, list: List<T>): List<T> {
    return if (list.isEmpty() || ((I > list.size) || (K > list.size)) || ((I < 0) || (K < 0))) {
        emptyList()
    } else {
        list.take(K).drop(I)
    }
}

fun <T> slice_(from: Int, to: Int, list: List<T>) = list.subList(from, to)

fun main() {
    val I = 3
    val K = 7
    val list = "abcdefghijk".toList()
    val n = list.size

    println("Extract slice from indices I=$I and K=$K from list $list size ($n)\n")
    val result: List<Char> = sliceList(I, K, list)

    if (result.isNullOrEmpty()) {
        println("Either list is empty or the indices $I and $K are not less than list size $n and both greater than 0")
    } else {
        println(result)
    }

    println("Or using sublist() from list we have list.sublist($I,$K) = "+ slice_(I,K,list))


}
