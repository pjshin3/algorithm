package com.example.algorithm

class HashTestB {

    fun solution(phonebook: Array<String>): Boolean{
        var result :Boolean = false

        val temp = phonebook.toList()
        val temp2 = phonebook.toList()

        temp.forEach {string ->
            temp2.forEach {
                result = it.any { it.equals(string) }

                if (result){
                    return result
                }

            }
        }

        return result
    }

}