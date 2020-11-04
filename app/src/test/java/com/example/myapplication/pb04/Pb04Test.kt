package com.example.myapplication.pb04

import com.example.myapplication.pb4.nrOfElements
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class P04Test {
    @Test
    fun `nr of elements of a list`() {
        assertThat(nrOfElements(listOf(1, 1, 2, 3, 5, 8)), equalTo(6))
    }
}