package com.example.algorithm

class HashTestAKotlin {

    fun solution(a : Array<String>, b: Array<String>) : String{
        val temp = a.toMutableList()
        b.forEach {
            if (temp.contains(it)){
                temp.remove(it)
            }
        }

        return temp.first()
    }
}