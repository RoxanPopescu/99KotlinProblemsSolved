package com.example.myapplication.pb091011

/**
 *
P10 (*) Run-length encoding of a list.
Use the result of problem P09 to implement the so-called run-length encoding data compression method.
Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E. Example:

> encode("aaaabccaadeeee".toList())
[(4, a), (1, b), (2, c), (2, a), (1, d), (4, e)]

 */

fun encodeList(list: List<Char>): List<Pair<Int, Char>> =
    list.packedEF().map {
        Pair(it.size, it.first())
    }

//    return packed(list).map{ iteratedList ->
//        Pair(iteratedList.size,iteratedList.first())
//    }


fun main() {
    val input = "faaaabccaadeeee".toList()
    println(" Input list: $input ")

    val resultList = encodeList(input)
    println(" \n Pb10 (*) Pack  duplicates of list elements into pairs: \n $resultList,")

    println(input.packedEF())

}
