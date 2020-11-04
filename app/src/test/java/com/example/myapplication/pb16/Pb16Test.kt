package com.example.myapplication.pb16


import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test
import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class Pb16Test {
    @Test
    fun `drop every n element of a list`() =
        assertThat(dropN(3, "abcdefghijk".toList()), equalTo("abcefgijk".toList()))
}