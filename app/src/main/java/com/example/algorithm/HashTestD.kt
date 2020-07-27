package com.example.algorithm

import android.util.Log

class HashTestD {

    fun solution(genres: Array<String>, plays: IntArray): IntArray{
        var result = intArrayOf()

        var map = plays.toList().zip(genres.toMutableList()).toMap()
        val templist = plays.copyOf()
        templist.sort()

        templist.forEach {
            println(plays.indexOf(it))
            println(map[it])
        }
        return result
    }
}