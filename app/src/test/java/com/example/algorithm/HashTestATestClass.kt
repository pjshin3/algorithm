package com.example.algorithm

import org.junit.Test
import junit.*
import junit.framework.Assert.assertEquals

class HashTestATestClass {
    private val testclass = HashTestAKotlin()
    private val testA = arrayOf("marina", "josipa", "nikola", "vinko", "filipa")
    private val testB = arrayOf("mislav", "stanko", "mislav", "ana")

    @Test
    fun Test(){
        val result = testclass.solution(testA,arrayOf("marina", "nikola", "vinko", "filipa"))
        assertEquals("eden",result)
    }
}