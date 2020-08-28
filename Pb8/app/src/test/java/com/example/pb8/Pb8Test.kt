package com.example.pb8

import org.hamcrest.core.IsEqual.equalTo
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class Pb8Test {
    class P08Test {
        @Test fun `eliminate consecutive duplicates of list elements`() {
            assertThat(compress("aaaabccaadeeee".toList()), equalTo("abcade".toList()))
        }
    }
}
