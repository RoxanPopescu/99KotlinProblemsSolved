package com.example.myapplication.pb25

import org.hamcrest.core.IsEqual.equalTo
import org.junit.Assert.assertThat
import org.junit.Test
import kotlin.random.Random

class Pb25Test {
    @Test
    fun `generate a random permutation of the elements of a list`(){
        assertThat(randomPermute("abcdef".toList(), Random(123)), equalTo("edbfac".toList()))
    }
}