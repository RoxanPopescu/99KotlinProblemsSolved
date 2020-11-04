package com.example.myapplication.pb07

import org.hamcrest.core.IsEqual.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class Pb07Test {
    @Test
    fun `flatten a nested list structure`() {
        assertThat(
            flattenList(listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8))),mutableListOf()),
            equalTo(listOf<Any?>(1, 1, 2, 3, 5, 8))
        )
    }
}