package com.example.algorithm

import android.util.Log

class HashTestC {

    fun solution(clothes : Array<Array<String>>){

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

    }
}