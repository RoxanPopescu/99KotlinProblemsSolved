package com.example.pb1

import com.example.pb2.lastButOne
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test

import org.junit.Assert.*


class P02Test {
    @Test
    fun `find the last but one element of a list`() {
        assertThat(lastButOne(listOf(1, 1, 2, 3, 5, 8)), equalTo(5))
    }
}