package com.example.myapplication.pb19


import org.hamcrest.core.IsEqual.equalTo
import org.junit.Test
import org.hamcrest.MatcherAssert.assertThat as assertThat

class Pb19Test {
    @Test
    fun `rotate a list n places to the left`() =
        run {
            val list: Array<Any> = "abcdefghijk".toList().toTypedArray()
            val expected:Array<Any> = ("jkabcdefghi").toList().toTypedArray()

            assertThat(
                list.rotateLeft(-2),equalTo(expected)
            )
        }
}