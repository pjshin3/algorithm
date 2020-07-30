package com.example.algorithm

class HashTestD {

    fun solution(genres: Array<String>, plays: IntArray): IntArray{
        val result = intArrayOf()
        val resultMap = mutableMapOf<String,ArrayList<Int>>()
        val comparaMap = (0..plays.last()).zip(plays.toList()).toMap()
        genres.distinct().forEach {
            resultMap.put(it, arrayListOf())
        }
        genres.forEachIndexed { index, s ->
            resultMap[s]?.add(comparaMap.keys.indexOf(index))
        }

        resultMap.values.indices.sorted()

        resultMap.values.forEach {
            println(it)
        }


        return result
    }
}