package com.example.myapplication.pb23



import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert
import org.junit.Test
import kotlin.random.Random

class Pb23Test {

    @Test
    fun `extract a given number of randomly selected elements from a list`() {
        Assert.assertThat(
            extractRandom(3, "abcdefgh".toList(), Random(123)),
            equalTo("gfa".toList()))
    }
}