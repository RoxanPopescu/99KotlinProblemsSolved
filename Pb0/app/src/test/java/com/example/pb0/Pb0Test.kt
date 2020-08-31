package com.example.pb0

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class Pb0Test {
    @Test fun `find the last element of a list`() {
        assertThat(advancedLastElementOfAList(listOf(1, 1, 2, 3, 5, 8)), equalTo(8))
    }
}
