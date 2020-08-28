package com.example.pb7

/** P07 (*) Flatten a nested list structure.
Example:
flatten(listOf( listOf(1, 1),
2,
listOf(3,
listOf(5, 8)) ) )
[1, 1, 2, 3, 5, 8]
 * */

fun flattenList(nestList: List<Any>, flatList: MutableList<Int>): List<Int> {
    for (e in nestList)
        if (e is Int) {
            flatList.add(e)
        } else {
            flattenList(e as List<Any>, flatList)
        }
    return flatList
}

fun main() {
    // val nestedList =  listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8)))
    val nestedList: List<Any> = listOf(
        listOf(1),
        2,
        listOf(listOf(3, 4), 5, 6),
        listOf(listOf(listOf<Int>())),
        listOf(listOf(listOf(6))),
        7,
        8,
        listOf<Int>()
    )
    println("Nested    : " + nestedList)
    val flatList = mutableListOf<Int>()
    println("Flattened : " + flattenList(nestedList, flatList))
}


