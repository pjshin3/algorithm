package com.example.algorithm

class HashTestD {

    fun solution(genres: Array<String>, plays: IntArray): IntArray{
        var result = intArrayOf()

        val map =genres.flatMap {it.toList() }.zip(plays.toList()).toMap()
        map.forEach {
            println(it.key)
        }

        return result
    }
}