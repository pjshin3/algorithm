package com.example.algorithm

class HashTestB {
    var result :Boolean = true
    fun solution(phonebook: Array<String>): Boolean{

        for (i in 0 .. phonebook.size -1){
            phonebook.forEach {
                if (phonebook[i] != it){
                    compare(phonebook[i], it)
                }
            }
        }

        return result
    }


    private fun compare(a : String, b : String){
        println("$a , $b")
        a.forEachIndexed { index, c ->

            if (index >= b.length || index >= a.length) return@forEachIndexed

            if (c == b[index]){
                println("$c , ${b[index]}")
                result = false
            }else{
                return
            }
        }

        return
    }
}