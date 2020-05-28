package com.example.algorithm

class HashTestAKotlin {
    fun solution(a : Array<String>, b: Array<String>) : String{
        val result = mutableListOf<String>()
        a.forEach {
            result.add(it)
        }

        println(result.size)
        for (i in a.indices){
            for (l in b.indices){
                if (a[i] == b[l]){
                    result.remove(a[i])
                    break
                }
            }
        }
        println(result.size)
        return result.elementAt(0)
    }
}