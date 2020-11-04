package com.example.myapplication.pb091011

import android.os.Build
import androidx.annotation.RequiresApi


/** P09 (*) Pack consecutive duplicates of list elements into sublists.
If a list contains repeated elements, they should be placed in separate sublists. Example:

> pack("aaaabccaadeeee".toList())
[[a, a, a, a], [b], [c, c], [a, a], [d], [e, e, e, e]]

P10 (*) Run-length encoding of a list.
Use the result of problem P09 to implement the so-called run-length encoding data compression method.
Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E. Example:

> encode("aaaabccaadeeee".toList())
[(4, a), (1, b), (2, c), (2, a), (1, d), (4, e)]


P11 (*) Modified run-length encoding.
Modify the result of problem P10 in such a way that if an element has no duplicates
it is simply copied into the result list.
Only elements with duplicates are transferred as (N, E) terms. Example:

> encodeModified("aaaabccaadeeee".toList())
[(4, a), b, (2, c), (2, a), d, (4, e)]
*/

fun runLengthEncoding(list: List<Char>): MutableList<MutableList<Char>> {

    var packedList: MutableList<MutableList<Char>> = mutableListOf()
    var frequencyPairList = mutableListOf<Any>()

    var index = 0
    val length = list.size - 1
    while (index < length) {
        val subList: MutableList<Char> = mutableListOf()

        if (list[index] != list[index + 1]) {
            subList.add(list[index])
            packedList.add(subList)
            // change to createPairsWithElementAndFrequency for Pb10
            frequencyPairList.add(createPairsWithFrequency(list[index], 1))

        } else {
            var count = 1

            while (list[index] == list[index + 1]) {
                ++index
                ++count
                if (index == length) {
                    break
                }
            }
            packedList.add(createSubList(list[index], count))
            frequencyPairList.add(createPairsWithFrequency(list[index], count))
        }
        index++
    }
    println("\n Pb10 (*)  Modified run-length encoding(Frequency list): \n $frequencyPairList, ")
    return packedList
}

fun modifiedRunLengthEncoding(list: List<Char>): List<Pair<Int,Char>> {

    var packedList: MutableList<MutableList<Char>> = mutableListOf()
    var frequencyPairList = mutableListOf<Pair<Int,Char>>()

    var index = 0
    val length = list.size - 1
    while (index < length) {
        val subList: MutableList<Char> = mutableListOf()

        if (list[index] != list[index + 1]) {
            subList.add(list[index])
            packedList.add(subList)

            frequencyPairList.add(createPairsWithElementAndFrequency(list[index], 1))

        } else {
            var count = 1

            while (list[index] == list[index + 1]) {
                ++index
                ++count
                if (index == length) {
                    break
                }
            }
            packedList.add(createSubList(list[index], count))
            frequencyPairList.add(createPairsWithElementAndFrequency(list[index], count))
        }
        index++
    }
    return frequencyPairList
}

//Pb11
private fun createPairsWithElementAndFrequency(element: Char, frequency: Int): Pair<Int, Char> =
    Pair(frequency, element)


//Pb10
private fun createPairsWithFrequency(element: Char, frequency: Int): Any {
    return if (frequency == 1) {
        element
    } else {
        Pair(frequency, element)
    }
}

private fun createSubList(element: Char, frequency: Int): MutableList<Char> {
    val list: MutableList<Char> = mutableListOf()

    for (index in 0 until frequency) {
        list.add(index, element)
    }
    return list
}

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    val input = "faaaabccaadeeee".toList()
    println(" Input list: $input ")

    //pb9
    val resultList = runLengthEncoding(input)
    println(" \n Pb9 (*) Pack consecutive duplicates of list elements into sublists: \n $resultList,")

    //pb11
    println("\n Pb11 (*) Run-length encoding modified of a list(Frequency list): \n "+modifiedRunLengthEncoding(input))
}