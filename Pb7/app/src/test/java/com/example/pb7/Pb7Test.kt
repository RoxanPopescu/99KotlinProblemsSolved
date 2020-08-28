package com.example.pb7

import org.hamcrest.core.IsEqual.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class P07Test {
    @Test
    fun `flatten a nested list structure`() {
        assertThat(
            flattenList(listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8))),mutableListOf<Int>()),
            equalTo(listOf<Any>(1, 1, 2, 3, 5, 8))
        )
    }
}

