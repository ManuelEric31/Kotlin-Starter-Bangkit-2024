package com.dicoding.kotlin

import com.dicoding.kotlin.List

fun main () {
    val numbers = (1..100).toList()
    print(numbers.slice(1..10))
}


//public fun <T> List<T>.slice(indices: Iterable <Int>) : List <T> {
//
//}

/*
   output : [2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
*/