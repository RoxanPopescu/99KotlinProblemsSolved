package com.example.pb5


/***
 * P05 (*) Reverse a list.
 */

fun reverseList(list: List<Int>):List<Int> {
      val size = list.size
        return if (size <= 1) {
             list
        } else {
            reverseList(list.drop(1)) + list.first()
        }
//
//    val original = mutableListOf(list) as List<Int>
//    return original.asReversed()
}

fun main(){
    println("Initial list =" + listOf(1,1,3,5,8,13))
    println("Reverse a list =" + reverseList(listOf(1,1,3,5,8,13)))
}



