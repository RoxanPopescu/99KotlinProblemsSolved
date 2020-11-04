package com.example.myapplication.pb08

import org.hamcrest.core.IsEqual
import org.junit.Assert
import org.junit.Test

class Pb08Test {
    @Test
    fun `eliminate consecutive duplicates of a list`() {
        Assert.assertThat(
            compress("aaaabccaadeeeez".toList()),
            IsEqual.equalTo("abcadez".toList())
        )
    }
}