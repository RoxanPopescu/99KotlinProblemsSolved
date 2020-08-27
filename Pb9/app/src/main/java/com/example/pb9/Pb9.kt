package com.example.pb9

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi

/** P09 (*) Pack consecutive duplicates of list elements into sublists.
If a list contains repeated elements, they should be placed in separate sublists. Example:

> pack("aaaabccaadeeee".toList())
[[a, a, a, a], [b], [c, c], [a, a], [d], [e, e, e, e]]

P10 (*) Run-length encoding of a list.
Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E. Example:

> encode("aaaabccaadeeee".toList())
[(4, a), (1, b), (2, c), (2, a), (1, d), (4, e)]
 */

class Pb9 : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.N)
    fun packMyList(list: List<Char>): MutableList<MutableList<Char>> {

        var packedList: MutableList<MutableList<Char>> = mutableListOf()
        var frequencyPairList = mutableListOf<Any>()

        var index = 0
        val length = list.size - 1
        while (index < length) {
            val subList: MutableList<Char> = mutableListOf()

            if (list[index] != list[index + 1]) {
                subList.add(list[index])
                packedList.add(subList)
                // change to createPairsWithElementAndFrequency for Pb10
                frequencyPairList.add(createPairsWithFrequency(list[index],1))

            } else {
                var count = 1

                while (list[index] == list[index + 1]) {
                    ++index
                    ++count
                    if (index == length) {
                        break
                    }
                }
                packedList.add(createSubList(list[index], count))
                frequencyPairList.add(createPairsWithFrequency(list[index],count))
            }
            index++
        }

        //pb10 and pb11
        println("\n \n \n Frequency list: \n \n ")
        for (i in 0 until frequencyPairList.size - 1) {
            println(" $frequencyPairList, ")
        }

        return packedList
    }

    //Pb10
    private fun createPairsWithElementAndFrequency(element: Char, frequency: Int): Pair<Int,Char> = Pair(frequency, element)


    //Pb11
    private fun createPairsWithFrequency(element: Char, frequency: Int): Any {
        return if (frequency == 1) {
             element
        } else {
            Pair(frequency, element)
        }
    }


    private fun createSubList(element: Char, frequency: Int): MutableList<Char> {
        val list: MutableList<Char> = mutableListOf()

        for (index in 0 until frequency) {
            list.add(index, element)
        }
        return list
    }

    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = "faaaabccaadeeee".toList()
        println(" Input list: " + "\n")
        for (i in 0 until input.size - 1) {
            println(" $input[i], ")
        }

        //pb9
        val resultList = packMyList(input)

        println(" Packed list: ")

        for (i in 0 until resultList.size - 1) {
            for (j in 0 until resultList[i].size - 1) {
                println("  $resultList, ")
            }
        }
    }
}


