package com.example.pb8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/**
 * P08 (*) Eliminate consecutive duplicates of list elements.
If a list contains repeated elements, they should be replaced with a single copy of the element.
The order of the elements should not be changed. Example:

> compress("aaaabccaadeeee".toList())
[a, b, c, a, d, e]
 */
class MainActivity : AppCompatActivity() {

    private fun compress(duplicates: List<Char>): List<Char> = duplicates.distinct() ?: emptyList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listChars = "aaaabccaadeeee".toList()
        Log.i("List is:", listChars.toString())

        val listCharsCompressed = compress(listChars)
        Log.i("List is: $listCharsCompressed", " compressed")
    }
}
