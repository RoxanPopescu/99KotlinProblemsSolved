package com.example.myapplication.pb15

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsEqual.equalTo
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class Pb15Test {
    @Test
    fun `duplicate the elements of a list n times`() {
        assertThat(duplicate("abccd".toList(), 3), equalTo("aaabbbccccccddd".toList()))
    }

    @Test
    fun `when a list is empty, then function duplicate returns empty`() {
        assertThat(duplicate(emptyList(), 3), equalTo(emptyList()))
    }
}