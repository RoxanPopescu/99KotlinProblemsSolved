package com.example.pb2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.pb1.R

/**
 * P02 (*) Find the last but one element of a list.
 */
class MainActivity : AppCompatActivity() {

    private fun <T> lastButOne(list: List<T>): T = list[list.lastIndex-1]


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MAIN","= "+lastButOne(listOf(1,1,2,3,5,8)))
    }
}
