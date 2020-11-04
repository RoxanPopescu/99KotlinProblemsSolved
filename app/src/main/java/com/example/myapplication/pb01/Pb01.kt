package com.example.myapplication.pb01

/**
P01 (*) Find the last element of a list.
Example:
> last(listOf(1, 1, 2, 3, 5, 8))
8
 */

fun <Any> last(myList: List<Any>): Any {
    return if (myList.size - 1 > 0) myList[myList.size - 1]
    else "List is empty" as Any
}

fun <T> advancedLastElementOfAList(myList: List<T>): T = myList[myList.lastIndex]

fun main() {
    val localList: List<Any> = listOf(1, 1, 2, 3, 5, 8, -6)

    println("1st solution last element of the list is : " + last(emptyList()))
    println("2nd solution last element of the list is : " + advancedLastElementOfAList(localList))
    localList.lastIndex
}
