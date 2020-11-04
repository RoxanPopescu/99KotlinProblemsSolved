package com.example.myapplication.pb03

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class P03Test {
    @Test
    fun `find the Nth element of a list`() =
        assertThat(nthElement2(listOf(1, 1, 2, 3, 5, 8), 4), equalTo(5))
}