package com.example.myapplication.pb12


import org.hamcrest.core.IsEqual
import org.junit.Assert
import org.junit.Test

class Pb12Test {
    @Test
    fun `eliminate consecutive duplicates of a list`() {
        Assert.assertThat(
            decode(listOf(
                Pair(4, 'a'),
                Pair(1, 'b'),
                Pair(2, 'c'),
                Pair(2, 'a'),
                Pair(1, 'd'),
                Pair(4, 'e')
            )),
            IsEqual.equalTo("aaaabccaadeeee".toList())
        )
    }
}