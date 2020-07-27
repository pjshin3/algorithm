package com.example.algorithm

import android.util.Log

class HashTestD {

    fun solution(genres: Array<String>, plays: IntArray): IntArray{
        var result = intArrayOf()

        var map = plays.toList().zip(genres.toList()).toMap()
        val templist = plays.copyOf()

        map = map.toMutableMap()

        templist.forEachIndexed { index, i ->
           map[i]!!.plus("adfadsfasfsaf")
        }

        map.forEach{
            println(it)
        }

        return result
    }
}