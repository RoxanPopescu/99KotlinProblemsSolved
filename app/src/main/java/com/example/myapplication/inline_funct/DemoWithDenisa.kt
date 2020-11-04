package com.example.myapplication.inline_funct




inline fun funcA(list: List<Pair<Int,Int>>, func:(Int,Int)->Int ) :List<Int> {

    return list.map{
        func(it.first,it.second)
    }
}

fun main(){

    val inputList =
        listOf(Pair(1,3),Pair(4,5),Pair(5,6))

   // val lambdaExpr: (Int,Int) -> Int = { a,b -> a+b}

    val listFinal = funcA(inputList) { a, b -> a + b }
    println(listFinal)

}