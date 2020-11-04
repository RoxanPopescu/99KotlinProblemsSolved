package com.example.myapplication.pb17



import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class Pb17Test {
    @Test
    fun `split a list in 2 where 1st sublistlist has n elements`() =
        assertThat(
            splitList(3, "abcdefghijk".toList()),
            equalTo(Pair("abc".toList(),"defghijk".toList()))
        )
}

