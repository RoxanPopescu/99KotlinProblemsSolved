package com.example.myapplication.pb19


import kotlin.math.abs


/**
 * (*) Rotate a list N places to the left.
Examples:

 * > rotate(3, "abcdefghijk".toList())
[d, e, f, g, h, i, j, k, a, b, c]

> rotate(-2, "abcdefghijk".toList())
[j, k, a, b, c, d, e, f, g, h, i]
 */


inline fun <reified T> Array<T>.rotateLeft(n: Int) =
    let {
        when {
            abs(n) > size -> {
                emptyArray<T>()
            }
            n > 0 -> {
                sliceArray(n until size) + sliceArray(0 until n)
            }
            else -> {
                sliceArray(size - (-n) until size) + sliceArray(0 until size - (-n))
            }
        }
    }

fun main() {

    val list: Array<Any> = "abcdefghijk".toList().toTypedArray()
    val n = -2

    println("Rotate the list $n places to the left  ")
    for (element in list) {
        print("$element ")
    }

    println("\n Resulting list is : ")

    val shiftedList = list.rotateLeft(n)

    if(shiftedList.isEmpty())
     println(" empty, because $n is greater then the list size ${list.size} ")

    for (element in shiftedList) {
        print("$element ")
    }
}

