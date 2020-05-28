package com.example.algorithm

import org.junit.Test
import junit.*
import junit.framework.Assert.assertEquals

class HashTestATestClass {
    private val testclass = HashTestAKotlin()
    private val testA = arrayOf("leo","kiki","eden")
    private val testB = arrayOf("marina", "josipa", "nikola", "vinko","filipa")
    private val testC = arrayOf("mislav", "stanko", "mislav", "ana")

    @Test
    fun Test(){
        val result = testclass.solution(testC,arrayOf("stanko", "ana", "mislav"))
        assertEquals("mislav",result)
    }
}