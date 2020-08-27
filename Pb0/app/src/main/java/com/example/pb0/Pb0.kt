package com.example.pb0


import android.util.Log

private val localList: List<Int> = listOf(1, 1, 2, 3, 5, 8)
fun <T> advancedLastElementOfAList(myList: List<T>): T = myList[myList.lastIndex]

fun main() {

    localList.lastIndex
    println("1st solution last element of the list is : " + last(localList))
    println("2nd solution last element of the list is : " + advancedLastElementOfAList(localList))
}

  private fun last(myList: List<Int>): Int {

    val length = localList.size - 1

    return if (length < 0) {
        return -1
    } else {
        myList[length]
    }
}
