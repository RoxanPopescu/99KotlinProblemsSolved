package com.example.myapplication.pb24

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert
import org.junit.Test
import kotlin.random.Random

class Pb24Test {

    @Test
    fun `draw N different random numbers from the set 1 to M`(){
        Assert.assertThat(
            lotto(3, (1..49).toList(), Random(123)),
            equalTo(listOf(24, 10, 27)))
    }
}