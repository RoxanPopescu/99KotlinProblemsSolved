package com.example.pb12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/**
 * P12 (*) Decode a run-length encoded list.
Given a run-length code list generated as specified in the problem P10, construct its uncompressed version. Example:

> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
[a, a, a, a, b, c, c, a, a, d, e, e, e, e]
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val inputSet =  listOf(
//                setOf(4,'a'), setOf(1,'b'), setOf(2,'c'), setOf(2,'a'), setOf(1,'d'),setOf(4,'e'))
        val inputPair = listOf(
                Pair(4, 'a'),
                Pair(1, 'b'),
                Pair(2, 'c'),
                Pair(2, 'a'),
                Pair(1, 'd'),
                Pair(4, 'e'))

        println(" Input list: " + "\n")
        for (i in 0 until inputPair.size - 1) {
            println(" $inputPair ")
        }

        //pb12
        //  val resultList = decodeRunLegthList(inputSet)
//        println(" Decoded list is : " + "\n")
//        for (i in 0 until resultList.size - 1) {
//            Log.i("RES", "="+ resultList[i])
//        }

        val result = decodeList(inputPair)
        println(" Decoded list is : " + "\n")

        for (i in 0 until result.size - 1) {
            println(" $result [i]) ")
        }
    }


    private fun decodeList(inputList: List<Pair<Int, Char>>): List<Any> {
        var mergedList: MutableList<Char> = mutableListOf()

        for (listItem in 0..inputList.size-1) {

            // val subList: Pair<Int, Char> = inputList[listItem]
            val first = inputList[listItem].first
            val second = inputList[listItem].second

            var freq = 0
            while (freq < first) {
                mergedList.add(second)
                freq++
            }
        }
        return mergedList
    }

    private fun decodeRunLegthList(input: List<Set<Any>>): List<Any> {
        return input.flatten()
    }

}
