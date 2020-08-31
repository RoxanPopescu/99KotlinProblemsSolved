package com.example.pb3


/**
 * P03 (*) Find the Nth element of a list.
By convention, the first element in the list is element 0. Example:
> nth(2, listOf(1, 1, 2, 3, 5, 8))
2
 */

 fun nthElement(list: List<Int>, n: Int): Int {
    return if (list.isEmpty() || list.size < kotlin.math.abs(n)) {
        -1
       /* "The $n - th element does not exist!"*/
    } else {
        /*"The element indexed $n is  " + */
        list[n - 1]

    }
}

fun main() {
    println(" Find the Nth element of a list: " + nthElement(listOf(1, 1, 2, 3, 5, 8), 5))
}




