package com.example.myapplication.high_order_functions


// lambda expression
var lambda = {
    println("Lambda expressions in Kotlin")
}
var lambdaInt = {a: Int , b: Int -> a + b }


// regular function
fun addfunc(a: Int, b: Int): Int {
    var sum = a + b
    return sum
}

fun multiplyfunc(a: Int, b: Int): Int{
    return a*b
}

// higher-order function
fun higherfunc(lmbd: () -> Unit) {      // accepting lambda as parameter - lmbd: () function
    lmbd()                               //invokes lambda expression
}

//a HO- funct that returns a function
fun higherfuncMultiply() : ((Int,Int)-> Int){
    return ::multiplyfunc
}

fun higherfuncWithParams( lmbd: (Int, Int) -> Int){

    var result = lmbd(2,4) // invokes the lambda expression by passing parameters
    println("The sum of two numbers is: $result")
}

fun higherfunc(addfunc:(Int,Int)-> Int){
    // invoke regular function using local name
    var result = addfunc(3,6)
    print("The sum of two numbers is: $result")
}

fun main(args: Array<String>) {
    //invoke higher-order function
    higherfunc(lambda)                 // passing lambda as parameter
    higherfuncWithParams(lambdaInt)
    // invoke higher-order function
    //use the notation :: to pass a function as an argument inside another function
    higherfunc(::addfunc)

    // invoke function and store the returned function into a variable
    val multiply = higherfuncMultiply()

    // invokes the multiply() function by passing arguments
    // - interesting that I cannot switch the order with multiply var

    val result = multiply(2,4)

    println("\n The multiplication of two numbers is: $result")

    //Closures are functions that can access and modify properties
    // defined outside the scope of the function.
    var res = 0
    val myList = listOf(1,2,3,4,5,6,7,8,9,10)
    myList.forEach { res+=it }
    println(res)

}

