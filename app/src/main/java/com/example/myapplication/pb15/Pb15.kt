package com.example.myapplication.pb15


/**
 * P15 (*) Duplicate the elements of a list a given number of times.
Example:

> duplicateN(3, "abccd".toList())
[a, a, a, b, b, b, c, c, c, c, c, c, d, d, d]
 * */

//refactor wih flatMap and List(x){y} - done

fun duplicate(list: List<Char>, n: Int): List<Char> {
    var finalList = mutableListOf<Char>()

    if(list.isNullOrEmpty()){
        return emptyList()
    }
    for(index in list.indices step 1){
        finalList.addAll( List(n){ list[index]} )
    }
    return finalList
}


fun main(){
    val n = 3
    println("The  input list is:" + "abccdZ".toList() + " , n = $n nr of duplicate per item")
    println("The output list is:" + duplicate("abccdZ".toList(),n))
    println("The output list for an emptylist is:" + duplicate(emptyList(),n))
}