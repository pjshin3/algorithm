package com.example.algorithm

class HashTestB {

    fun solution(phonebook: Array<String>): Boolean{
        var result :Boolean = false

        val temp = phonebook.toList()
        val temp2 = phonebook.toList()


        temp.forEach {firstString ->
            temp2.forEach { second ->
                firstString.forEachIndexed{index, c ->
                    if (second.get(index).equals(c)){
                        println("$c, ${firstString.get(index)}")
                    }
                }
            }
        }


        return result
    }

}