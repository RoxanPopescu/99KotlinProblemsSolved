package com.example.myapplication.pb17

/**
 * P17 (*) Split a list into two parts.
The length of the first part is given.
Use a Pair for your result. Example:

> split(3, "abcdefghijk".toList())
([a, b, c], [d, e, f, g, h, i, j, k])
 */

fun <T> splitList(n: Int, list: List<T>): Pair<List<T>,List<T>> = Pair(list.take(n),list.drop(n))

fun main(){
    val n = 3
    val list = "abcdefghijk".toList()
    println("Split list into 2 parts where 1st list has $n elements : ")
    val result =       splitList(n,list)
    println(" Pair${result.first}, ${result.second} ")

}