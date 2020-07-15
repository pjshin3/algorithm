package com.example.algorithm

class HashTestAKotlin {
    var result: String = ""
    fun solution(a : Array<String>, b: Array<String>) : String{
        val temp = a.toList()
        b.forEach {
            if (temp.contains(it)){
                println("$it")
            }else{
                println("$it")
                result = it
            }
        }
        return result
    }
}