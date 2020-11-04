package com.example.myapplication.pb25

import com.example.myapplication.pb23.extractRandom
import java.util.Collections.swap
import kotlin.random.Random

/**
 * P25 (*) Generate a random permutation of the elements of a list.
Make sure there is a way to produce deterministic results.
Hint: Use the solution of problem P23. Example:

> randomPermute("abcdef".toList())
[d, b, e, f, a, c]
 */

fun randomPermute(list: List<Char>, random: Random): List<Char> {

   return extractRandom(list.size,list,random)
}

fun randomPermutate(list: List<Char>, random: Random): List<Char> {

    var collection = arrayListOf<Char>()

    list.forEach {
        collection.add(it)
    }
    collection.shuffle(random)

    return collection.toList()
}

fun shuffle(list: MutableList<Char>, rnd: Random) :List<Char> {
    val size = list.size
    val SHUFFLE_THRESHOLD = 1000

    if (size < SHUFFLE_THRESHOLD || list is RandomAccess) {
        for (i in size downTo 2)
            swap(list, i - 1, rnd.nextInt(i))
    } else {
        val arr: Array<Char> = list.toTypedArray()

        // Shuffle array
        for (i in size downTo 2) swap(arr.toMutableList(), i - 1, rnd.nextInt(i))

        // Dump array back into list
        val it = list.listIterator()
        for (i in arr.indices) {
            it.next()
            it.set(arr[i])
        }
    }
    return list
}

fun main() {
    val list = "abcdef".toMutableList()
    val randomNr = Random(123)
    println(list)

    val result  = randomPermutate(list, randomNr)
    val result2 = shuffle(list, randomNr)
    val result3 = randomPermute(list,randomNr)

    println("1. Random permutation of a list with random nr is $result2)")
    println("2. Random permutation of a list with random nr is $result)")
    println("3. Random permutation of a list with random nr is $result3)")

}
