package com.example.algorithm

import junit.framework.Assert
import org.junit.Assert.assertEquals
import org.junit.Test

class HashTestBTestClass {

    private val testClass = HashTestB()
    private val testCaseA = arrayOf("199","97674223","1195524421")
    private val testCaseB = arrayOf("123","456","789")
    @Test
    fun `접두사 찾기`(){
        val result = testClass.solution(testCaseB)
        assertEquals(false, result)
    }
}