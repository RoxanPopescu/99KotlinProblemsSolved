package com.example.pb15

/**
 * P15 (*) Duplicate the elements of a list a given number of times.
Example:

> duplicateN(3, "abccd".toList())
[a, a, a, b, b, b, c, c, c, c, c, c, d, d, d]
 * */


fun duplicate(list: List<Char>, n: Int): List<Char> {
    var finalList = mutableListOf<Char>()
    if(finalList.isNullOrEmpty()){
        return emptyList()
    }
    for(index in 0 until list.size step 1){
        var count = 0

        do{
            finalList.add(list[index])
            count += 1
        }while(count < n)
    }
    return finalList
}

fun main(){
    val n = 3
    println("The  input list is:" + "abccd".toList() + " , n = $n nr of duplicate per item")
    println("The output list is:" + duplicate("abccd".toList(),n))
    println("The output list for an emptylist is:" + duplicate(emptyList(),n))
}