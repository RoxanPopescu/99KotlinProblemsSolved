package com.example.myapplication.pb22

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert
import org.junit.Test

class Pb22Test {

    @Test
    fun `create a list containing all integers from a to b`() {
        Assert.assertThat(
            rangeListFrom(4, 9),
            equalTo(listOf(4,5,6,7,8,9))
        )
    }
}