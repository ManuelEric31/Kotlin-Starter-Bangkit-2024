package com.dicoding.kotlin

fun main  () {

}

inline fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}