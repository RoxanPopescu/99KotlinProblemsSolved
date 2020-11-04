package com.example.myapplication.pb05

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test
import org.junit.Assert.*

class P05Test {
    @Test
    fun `reverse a list`() {
        assertThat(reverseList(listOf(1, 1, 2, 3, 5, 8, 13,"ds")),equalTo((listOf("ds",13, 8, 5, 3, 2, 1, 1))))
    }
}