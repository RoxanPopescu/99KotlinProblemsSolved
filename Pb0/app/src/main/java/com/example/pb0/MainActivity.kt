package com.example.pb0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val localList: List<Int> = listOf(1, 1, 2, 3, 5, 8)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        localList.lastIndex
        Log.i("MAIN", "= last element of the list is : " + last(localList))
        Log.i("MAIN", "= last element of the list is : " + advancedLastElementOfAList(localList))
    }

    private fun last(myList: List<Int>): Int {

        val length = localList.size - 1

        return if (length < 0) {
            return -1
        } else {
            myList[length]
        }
    }

    fun <T> advancedLastElementOfAList(myList: List<T>): T = myList[myList.lastIndex]

}
