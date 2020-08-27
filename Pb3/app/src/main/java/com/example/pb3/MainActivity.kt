package com.example.pb3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Math.abs

/**
 * P03 (*) Find the Nth element of a list.
By convention, the first element in the list is element 0. Example:

> nth(2, listOf(1, 1, 2, 3, 5, 8))
2
 */
class MainActivity : AppCompatActivity() {

    private fun <T> nthElement(list: List<T>, n: Int): String {
        return if(list.isEmpty() || list.size < kotlin.math.abs(n)){
           "The $n - th element does not exist!"
        }else{
            "The element indexed $n is  " + list[n-1]
        }
    }

    tailrec fun <T> nth(n: Int, list: List<T>): T {
        if (n < 0) throw IllegalArgumentException()
        return if (n == 0) list.first() else nth(n - 1, list.subList(0,n-1))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("main","= "+nthElement(listOf(1,1,2,3,5,8),-7))
        //Log.i("main","= "+nth(-4,listOf(1,1,2,3,5,8)))
    }
}


