package com.example.algorithm

import org.junit.Test
import junit.framework.Assert.assertEquals

class HashTestATestClass {

    private val testclass = HashTestA()
    private val testCaseA = arrayOf("leo","kiki","eden")
    private val testCaseB = arrayOf("marina", "josipa", "nikola", "vinko","filipa")
    private val testCaseC = arrayOf("mislav", "stanko", "mislav", "ana")

    @Test
    fun `각 배열에서 틀린 단어 찾기`(){
        val result = testclass.solution(testCaseC,arrayOf("marina", "josipa", "vinko","filipa"))
        assertEquals("mislav",result)
    }
}