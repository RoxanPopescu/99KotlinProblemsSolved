package com.example.myapplication.pb18

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class Pb18Test {
    @Test
    fun `slice a list with n elements from index I to K-1`() =
        assertThat(
            sliceList(3,7, "abcdefghijk".toList()),
            equalTo(("defg").toList())
        )
}