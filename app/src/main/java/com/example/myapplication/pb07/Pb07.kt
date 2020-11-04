package com.example.myapplication.pb07


/** P07 (*) Flatten a nested list structure.
Example:
flatten(listOf( listOf(1, 1),
2,
listOf(3,
listOf(5, 8)) ) )
[1, 1, 2, 3, 5, 8]
 * */

fun flattenList(nestList: List<Any?>, flatList: MutableList<Any?>): List<Any?> {

    for (e in nestList)
        if (e is List<*>) {
            flattenList(e, flatList)
        }else {
            flatList.add(e)
        }
    return flatList
}

fun main() {

    val nestedList: List<Any?> = listOf(
        listOf(1),
        "Dana",
        null,
        2,
        listOf(listOf(3, 4), 5, 6),
        listOf(listOf(listOf<Int>())),
        listOf(listOf(listOf(6))),
        7,
        8,
        listOf<Int>()
    )
    println("Nested list: " + nestedList)
    val flatList = mutableListOf<Any?>()
    println("Flattened list : " + flattenList(nestedList, flatList))
}
