package com.example.algorithm

import android.util.Log

class HashTestC {

    fun solution(clothes : Array<Array<String>>): Int{
        var result = 0

        val map = mutableMapOf<String, ArrayList<String>>()

        clothes.forEach {
            it.reversedArray().forEachIndexed { index, s ->
                if (!map.containsKey(s) && !s.contains("_")){
                    map.put(s, arrayListOf(it[0]))
                } else if (map.containsKey(s)){
                    map[s]?.add(it[0])
                }
            }
        }
        var temp = 0
        var beforeKey =""

        map.forEach {
            result += it.value.size

            if (map.size > 1){
                if (temp > 0){
                    temp *= it.value.size
                }else{
                    temp = it.value.size
                }
            }


            beforeKey = it.key
        }


        result += temp
        println(result)

        return result
    }
}