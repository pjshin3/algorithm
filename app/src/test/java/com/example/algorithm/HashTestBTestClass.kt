package com.example.algorithm

import org.junit.Assert.assertEquals
import org.junit.Test

class HashTestBTestClass {

    private val testClass = HashTestB()
    private val testCaseA = arrayOf("119","97674223","1195524421")
    private val testCaseB = arrayOf("123","456","789")
    private val testCaseC = arrayOf("12","123","1235","567","88")
    @Test
    fun `접두사 찾기`(){
        val result = testClass.solution(testCaseC)
        assertEquals(false, result)
    }
}