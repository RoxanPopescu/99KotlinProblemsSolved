package com.example.pb7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.absoluteValue

/** P07 (*) Flatten a nested list structure.
Example:

> flatten(listOf( listOf(1, 1),
2,
listOf(3,
listOf(5, 8)) ) )
[1, 1, 2, 3, 5, 8]
 * */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nestedList =  listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8)))

//        val nestedList : List<Any> = listOf(
//                listOf(1),
//                2,
//                listOf(listOf(3, 4), 5),
//                listOf(listOf(listOf<Int>())),
//                listOf(listOf(listOf(6))),
//                7,
//                8,
//                listOf<Int>()
//        )
        println("Nested    : " + nestedList)
        val flatList = mutableListOf<Int>()
        flattenList(nestedList, flatList)
        println("Flattened : " + flatList)
    }

    private fun flattenList(nestList: List<Any>,flatList: MutableList<Int>) {
        for (e in nestList)
            if (e is Int) {
                flatList.add(e)
            }
            else {
                flattenList(e as List<Any>, flatList)
            }
    }

}
