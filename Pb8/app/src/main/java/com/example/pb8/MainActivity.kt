package com.example.pb8

/**
 * P08 (*) Eliminate consecutive duplicates of list elements.
If a list contains repeated elements, they should be replaced with a single copy of the element.
The order of the elements should not be changed. Example:

> compress("aaaabccaadeeee".toList())
[a, b, c, a, d, e]
 */

fun compress(duplicates: List<Char>): List<Char> = duplicates.distinct() ?: emptyList()
fun main() {

    val listChars = "aaaabccaadeeee".toList()
    println("Input list is : $listChars")
    println(" Pb8  Eliminate consecutive duplicates output: " + compress(listChars))

    //NOTE - it is not finished, because the second char 'a' is eliminated :(
}
