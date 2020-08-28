package com.example.pb12

/**
 * P12 (*) Decode a run-length encoded list.
 *  Given a run-length code list generated as specified in the problem P10,
 *  construct its uncompressed version. Example:

> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
[a, a, a, a, b, c, c, a, a, d, e, e, e, e]
 */

fun decodeList(inputList: List<Pair<Int, Char>>): List<Char> {
    var mergedList: MutableList<Char> = mutableListOf()

    for (listItem in 0..inputList.size - 1) {
        val first = inputList[listItem].first
        val second = inputList[listItem].second

        var freq = 0
        while (freq < first) {
            mergedList.add(second)
            freq++
        }
    }
    return mergedList
}

fun <T> decode(list: List<Pair<Int, T>>): List<T> = list.flatMap {
        (x, y) -> List(x) { y } }

fun main() {
    val inputPair:List<Pair<Int, Char>> = listOf(
        Pair(4, 'a'),
        Pair(1, 'b'),
        Pair(2, 'c'),
        Pair(2, 'a'),
        Pair(1, 'd'),
        Pair(4, 'e')
    )

    println(" Input list: $inputPair ")

    val result = decodeList(inputPair)
    println(" Decoded list is : $result )")
    println(" Decoded list is : ${decode(inputPair)} )")

}
