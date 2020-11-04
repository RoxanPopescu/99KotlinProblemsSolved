package com.example.myapplication.pb08

/**
 * P08 (*) Eliminate consecutive duplicates of list elements.
If a list contains repeated elements, they should be replaced with a single copy of the element.
The order of the elements should not be changed. Example:

> compress("aaaabccaadeeee".toList())
[a, b, c, a, d, e]
 */

fun compress(duplicates: List<Char>?): List<Char> {

    var result = mutableListOf<Char>()

    return if (duplicates.isNullOrEmpty()) {
        mutableListOf()
    } else {
        var index = 0
        do {
            if (index < duplicates.lastIndex){
                if(duplicates[index] != duplicates[index + 1]){
                    result.add(duplicates[index])
                }
            } else if (index == duplicates.lastIndex)
             {
                if (duplicates.last() != (duplicates.last() - 1)){
                    result.add(duplicates.last())
                }
                break
            }
            index++

        } while (index <= duplicates.size - 1)
        result
    }
}

fun main() {
    val listChars: List<Char> = "aaaabccaadeeeez".toList()
    println("Input list is : $listChars")
    println(" Pb8  Eliminate consecutive duplicates output: " + compress(listChars))

}