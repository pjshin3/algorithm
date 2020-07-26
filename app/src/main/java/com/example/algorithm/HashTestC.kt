package com.example.algorithm

class HashTestC {

    fun solution(clothes : Array<Array<String>>): Int{
//        clothes.groupBy { it[1] }.forEach {
//            it.value.forEach {
//                it.forEach {
//                    println(it)
//                }
//            }
//        }
        return clothes.groupBy { it[1] }.values.fold(1) { acc, v -> acc * (v.size + 1) }  - 1
    }
}