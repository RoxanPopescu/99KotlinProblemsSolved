package com.example.myapplication.pb13


import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert
import org.junit.Test

class Pb13Test {

    @Test
    fun `Run-length encoding of a list`() {
        Assert.assertThat(
            encodeDirect("aaaabccaadeeee".toList()),
            equalTo(
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