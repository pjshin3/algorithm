package com.example.algorithm

import java.util.*

class HashTestAKotlin {
    fun solution(a : Array<String>, b: Array<String>) : String{
        var A = listOf(a)
        val B = listOf(b)
        val result = mutableListOf(a)

        a.forEachIndexed { indexa, itema ->
            println("a = $indexa, $itema")
            b.forEachIndexed{indexb, itemb ->
                println("a = $indexa, $itemb")
                result.drop(indexb)
            }
        }

        println(result.size)
        return result[0][0]
    }
}