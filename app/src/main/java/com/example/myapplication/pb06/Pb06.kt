package com.example.myapplication.pb06

/** P06 (*) Find out whether a list is a palindrome.
Example:

> isPalindrome(listOf(1, 2, 3, 2, 1))
true
 * */


fun <T> isPalindrome_(list: List<T>) = list == list.asReversed()

fun isPalindrome(list: List<Int>): Boolean {

    val length: Int = list.size
    val midLength: Int = (length / 2) + length.rem(2)
    var index = 0

    if (length <= 0) {
        IllegalAccessException("Empty list cannot be checked for palindrom.")
    } else {
        while (index < midLength) {
            if (list[index] != list[length - index - 1]) {
                return false
            }
            index += 1
        }
    }
    return true
}

fun main() {
    println("isPalindrome= " + isPalindrome(listOf(1, 2)))
    println("isPalindrome= " + isPalindrome(listOf(1, 2, 3, 4, 3, 2, 1)))
    println("isPalindrome_ = " + isPalindrome_(listOf(1, 2, 3, 4, 3, 2, 1)))
}



