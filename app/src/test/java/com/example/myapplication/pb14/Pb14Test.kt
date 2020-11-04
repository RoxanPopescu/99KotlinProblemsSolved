package com.example.myapplication.pb14

import org.hamcrest.core.IsEqual
import org.junit.Test
import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class Pb14Test {
    @Test
    fun `duplicate the elements of a list`() {
        assertThat(duplicate("abccd".toList()), IsEqual.equalTo("aabbccccdd".toList()))
    }
}