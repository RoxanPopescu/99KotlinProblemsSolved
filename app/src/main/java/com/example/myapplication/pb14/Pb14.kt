package com.example.myapplication.pb14

/**
 * P14 (*) Duplicate the elements of a list.
 * Example:

> duplicate("abccd".toList())
[a, a, b, b, c, c, c, c, d, d] */

fun duplicate(list: List<Char>): List<Char> = list.flatMap { listOf(it, it) }

fun main() {
    val inputList: List<Any>? = "abccd".toList() //emptyList<Any>()// null

    println("The inputlist is : $inputList")
    //   println("The list with duplicates is : " + duplicate(inputList))
    println("The list with duplicatedEF is : " + inputList.duplicatedEF2())
   // println("The output list for an emptylist is:" + duplicate(emptyList()))
}

fun <T> List<T>?.duplicatedEF(): List<T> {

    return if (this.isNullOrEmpty()) return emptyList()
    else {
        this.fold(emptyList(), { result, item ->
            result + item + item
        })
    }
}

fun <T> List<T>?.duplicatedEF2(): List<T> = this?.fold(emptyList(),
    { result, item ->
    result + item + item
}) ?: emptyList()
