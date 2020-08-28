package com.example.pb12

import org.hamcrest.core.IsEqual.equalTo
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class Pb12Test {
        @Test fun `decode a run-length encoded list`() {
            assertThat(decodeList(listOf(
                Pair(4, 'a'),
                Pair(1, 'b'),
                Pair(2, 'c'),
                Pair(2, 'a'),
                Pair(1, 'd'),
                Pair(4, 'e')
            )), equalTo("aaaabccaadeeee".toList()))
        }
}
