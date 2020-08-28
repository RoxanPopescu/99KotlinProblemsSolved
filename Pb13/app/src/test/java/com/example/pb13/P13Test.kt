package com.example.pb13

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class P13Test {
    @Test
    fun `run-length encoding of a list (direct solution)`() {
        assertThat(
            encodeDirect("aaaabccaadeeee".toList()), equalTo(
                listOf(
                    Pair(4, 'a'),
                    Pair(1, 'b'),
                    Pair(2, 'c'),
                    Pair(2, 'a'),
                    Pair(1, 'd'),
                    Pair(4, 'e')
                )
            )
        )
    }
}
