package com.example.pb5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.IllegalArgumentException


/***
 * P05 (*) Reverse a list.
 */
class MainActivity : AppCompatActivity() {

    private fun reverseList(list: List<Int>):List<Int> {
//      val size = list.size
//        return if (size <= 1) {
//             list
//        } else {
//            reverseList(list.drop(1)) + list.first()
//        }

        val original = mutableListOf(list) as List<Int>
       return original.asReversed()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("pb5","=" + reverseList(listOf(1,1,3,5,8,13)))
    }
}
