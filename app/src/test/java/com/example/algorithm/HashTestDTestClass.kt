package com.example.algorithm

import org.junit.Test

class HashTestDTestClass {


    private val hashTaskD = HashTestD()
    private val testCaseAtype = arrayOf("classic", "pop", "classic", "classic", "pop")
    private val testCaseAplays = intArrayOf(500, 600, 150, 800, 2500)

    @Test
    fun `베스트 앨범`(){
        hashTaskD.solution(testCaseAtype,testCaseAplays)
    }

}