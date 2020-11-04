package com.example.myapplication.pb091011


/**
 *
P11 (*) Modified run-length encoding.
Modify the result of problem P10 in such a way that if an element has no duplicates
it is simply copied into the result list.
Only elements with duplicates are transferred as (N, E) terms. Example:

> encodeModified("aaaabccaadeeee".toList())
[(4, a), b, (2, c), (2, a), d, (4, e)]

 */

fun modifiedRunLE(list: List<Char>): List<Any> =
    list.packedEF().map {
       if(it.size>1)  Pair(it.size , it.first())
       else it.first()
    }

fun main() {
    val input = "faaaabccaadeeee".toList()
    println(" Input list: $input ")

    val resultList = encodeList(input)

    //pb11
    println("\n Pb11 (*) Run-length encoding modified of a list(Frequency list): \n "+modifiedRunLE(input))
}