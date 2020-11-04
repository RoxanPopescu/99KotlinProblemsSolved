package com.example.myapplication.pb21

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert
import org.junit.Test

class Pb21Test {

    @Test
    fun `insert an element at a given position into a list`() {
        Assert.assertThat(
            insertAt('X', 1, "abcd".toList()),
            equalTo("aXbcd".toList())
        )
    }
}
