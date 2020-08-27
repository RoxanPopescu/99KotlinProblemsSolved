package com.example.pb4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/**
 * P04 (*) Find the number of elements of a list.
* */
class MainActivity : AppCompatActivity() {

    fun <T> List<T>.tail(): List<T> = drop(1)

     fun <T> nrOfElements(list: List<T>): Int {
        return if (list.isEmpty()) 0
        else 1 + nrOfElements(list.tail())
     }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("pb","= "+nrOfElements(listOf(1,1,2,3,4,7,9,90)))
    }
}
