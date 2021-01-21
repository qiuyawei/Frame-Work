package com.yaya.framework

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    /**
     * 测试三目运算符
     */
    @Test
    fun testThirdCalculate() {
        val name: String? = null
        println(name ?: name)
    }
}