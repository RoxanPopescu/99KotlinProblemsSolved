package com.example.myapplication.inline_funct

import kotlin.concurrent.thread
// Inline functions  = copy the body of the function at call site,
//                     avoiding the creation of multiples unnecessary objects.
//                     And we should also be careful with non-local control flow.
// - Inlining works best for functions with lambda parameters

//Noinline functions = can be used when we have an inline function with multiple lambdas
//                     as parameters and we don't want to inline all of them.

//Crossinline functions = helps us enforce the control flow (return statement) of lambda functions
//                        passed as arguments in inline functions. Avoiding non-local control flow.

inline fun functionA() {
    println("awesomeness !")
}

inline fun functionB(lambda: () -> Unit) {
    println("awesomeness !")
    lambda.invoke()
}

fun main(args: Array<String>) {
    test4 {
        println("start")
        println("stop")
    }
   // functionA()
    //with lambda param
    functionB {
        println("double awesomeness")
    }
}

//1. noinline, block = f
inline fun test1(noinline f: () -> Unit) {
    thread(block = f)
}

// B works the same as A
fun test(f: () -> Unit) {
    thread { f() }
}

//fun compiledMain1() {
//    val myBlock = {
//        println("start")
//        println("stop")
//    }
//    thread(block = myBlock)
//}
//-> there's no evidence of inline fun test1 even existing.
// Inline functions aren't really "called": it's as if the code of test1 was written inside main()

//2. crossinline, block = f

// doesn't compile, since crossinline enforces only local control flow,
// and the expression block = f violates that.

// inline fun test2(crossinline f: () -> Unit) {
//    thread(block = f)
//}


//fun compiledMain2() {
//    thread(block =
//    println("start")
//            println("stop")
//    )
//}
//-> you requested to copy-paste the code of the block into a place that expects a value.
// It's just syntactic garbage.
// Reason: with or without crossinline you request that the block be copy-pasted into
// the place where it's used. This modifier just restricts what you can write
// inside the block (no returns etc.)

//3. noinline, { f() }

inline fun test3(noinline f: () -> Unit) {
    thread { f() }
}

//fun compiledMain3() {
//    val myBlock = {
//        println("start")
//        println("stop")
//    }
//    thread { myBlock() }
//}

//->You create a regular lambda object myBlock, then you create another regular lambda object
// that delegates to it: { myBlock() }, then you pass this to thread().

//4. crossinline, { f() }
inline fun test4(crossinline f: () -> Unit) {
    thread { f() }
}

//fun compiledMain4() {
//    thread {
//        println("start")
//        println("stop")
//    }
//}
//-> Finally this example demonstrates what crossinline is for.
// The code of test4 is inlined into main, the code of the block is inlined into the place
// where it's used. But, since it's used inside the definition of a regular lambda object,
// it can't contain non-local control flow.

