package com.dicoding.kotlin

typealias Arithmetic = (Int, Int) -> Int
fun main () {
    val sum : Arithmetic = {value1, value2 -> value1+value2}
    val mulitple : Arithmetic = {value1, value2 -> value1*value2}

    val sumResult = sum(10, 10)
    val multResult = sum(10, 10)

    println(sumResult)
    println(multResult)
}