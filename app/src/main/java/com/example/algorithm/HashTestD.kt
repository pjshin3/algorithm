package com.example.algorithm

class HashTestD {

    fun solution(genres: Array<String>, plays: IntArray): IntArray{

        var resulttest = arrayListOf<Int>()
        var map = plays.toList().zip(genres.toList()).toMap()
        val templist = plays.copyOf()
        val set = genres.copyOf()
        set.toSet().forEach{
            getindex(plays,templist,map,it).forEach {
                 resulttest.add(it)
            }
        }

        return resulttest.toIntArray()
    }

    private fun getindex(list: IntArray, sortList: IntArray ,map :Map<Int,String>,string: String) : ArrayList<Int>{
        var result = arrayListOf<Int>()

        sortList.forEach {
            if (map[it] == string){
                result.add(list.indexOf(it))
            }
        }

        return result
    }
}