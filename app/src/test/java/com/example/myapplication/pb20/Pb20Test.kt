package com.example.myapplication.pb20

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class Pb20Test {
    @Test
    fun `remove the Kth element from a list`() =
        Assert.assertThat(
            removeAt(1, "abcd".toList()),
            CoreMatchers.equalTo(Pair("acd".toList(), 'b'))
        )
}