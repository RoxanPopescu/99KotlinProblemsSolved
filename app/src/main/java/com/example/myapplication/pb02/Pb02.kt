package com.example.myapplication.pb02

/**
 * P02 (*) Find the last but one element of a list.
 */

fun <T> lastButOne(list: List<T>): T = list[list.lastIndex - 1]

fun <Any> lastButOne2(myList: List<Any>): Any {
    return if (myList.size - 1 > 0) myList[myList.lastIndex - 1]
    else "List is empty" as Any
}

fun main() {
    println(
        " last but one element of the list "
                + listOf(1, 1, 2, 3, 5, 8) + " is : "
                + lastButOne2(listOf(1, 1, 2, 3, 5, 8))+
                "\n for an empty list the result is: "+lastButOne2(emptyList())
    )
}