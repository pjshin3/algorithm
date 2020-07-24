package com.example.algorithm

import org.junit.Before
import org.junit.Test

class HashTestCTestClass {

    private val testcaseA = arrayOf(arrayOf("yellow_hat","headgear") , arrayOf("blue_sunglasses","eyewear"),arrayOf("green_turban","headgear"))
    lateinit var testclass : HashTestC
    @Before
    fun setUp(){
        testclass = HashTestC()
    }

    @Test
    fun `위장`(){
        testclass.solution(testcaseA)
    }
}