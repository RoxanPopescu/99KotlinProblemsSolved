package com.example.myapplication.pb06

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class Pb06Test {
    @Test
    fun `check if a list is palindrom`() {
        Assert.assertThat(
            isPalindrome_(listOf(1, 1, 2, 3, 5, 8, 13)),
            CoreMatchers.equalTo(false)
        )
    }
}