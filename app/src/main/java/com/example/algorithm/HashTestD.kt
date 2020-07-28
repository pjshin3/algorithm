package com.example.algorithm

class HashTestD {

    fun solution(genres: Array<String>, plays: IntArray): IntArray{
        val result = intArrayOf()

        val resultMap = mutableMapOf<String,ArrayList<Int>>()

        val comparaMap = (0..plays.last()).zip(plays.toList()).toMap()
        val comparaMapString = (0..genres.size).zip(genres.toList()).toMap()

        genres.distinct().forEach {
            resultMap.put(it, arrayListOf())
        }

        genres.forEachIndexed { index, s ->
            resultMap[s]?.add(comparaMap.keys.indexOf(index))
        }

        resultMap.forEach {
            println(it)
        }

        return result
    }
}