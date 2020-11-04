package com.example.myapplication.pb091011

import org.hamcrest.core.IsEqual
import org.junit.Assert
import org.junit.Test

class Pb091011Test {

    @Test
    fun `pack consecutive duplicates of list elements into sublists`() {
        Assert.assertThat(
            runLengthEncoding("faaaabccaadeeee".toList()),
            IsEqual.equalTo(listOf("f".toList(),
               "aaaa".toList(), "b".toList(),"cc".toList(),
               "aa".toList(), "d".toList(), "eeee".toList()))
        )
    }
    @Test
    fun `modified run length encoding of a list`() {
        Assert.assertThat(
            modifiedRunLengthEncoding("aaaabccaadeeee".toList()),
            IsEqual.equalTo(listOf(
                Pair(4,'a'),Pair(1,'b'),
                Pair(2,'c'),Pair(2,'a'),
                Pair(1,'d'),Pair(4,'e')
            ))
        )
    }
}