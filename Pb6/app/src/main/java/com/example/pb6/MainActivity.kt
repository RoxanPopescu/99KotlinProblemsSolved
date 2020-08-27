package com.example.pb6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/** P06 (*) Find out whether a list is a palindrome.
Example:

> isPalindrome(listOf(1, 2, 3, 2, 1))
true
 * */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("isPalindrome", "= " + isPalindrome(listOf(1,2)))
        Log.i("isPalindrome", "= " + isPalindrome_(listOf(1,2,3,4,3,2,1)))
    }

    private fun isPalindrome(list: List<Int>): Boolean {

        val length: Int = list.size
        val midLength: Int = (length / 2) + length.rem(2)
        var index = 0

        if (length <= 0) {
            IllegalAccessException("Empty list cannot be checked for palindrom.")
        } else {

            Log.i("MID", "= $midLength")

            while (index < midLength) {
                if (list[index] != list[length - index - 1]) {
                    return false
                }
                index += 1
            }
        }
        return true
    }


    @Suppress("unused")
    fun <T> isPalindrome_(list: List<T>) = list == list.asReversed()
}
