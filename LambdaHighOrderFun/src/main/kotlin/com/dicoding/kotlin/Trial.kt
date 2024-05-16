package com.dicoding.kotlin

fun main () {
    val total = listOf(1, 2, 3, 4, 5, 6)
    val result1 = total.take(5)
    val result2 = result1.takeLast(4)
    val result3 = result2.drop(1)
    val result4 = result3.dropLast(2)
    println(result4)

    for (i in 1..12 step 3) {
        print("$i ")
    }

    var y = 1
    do {
        println("Hello Dicoding")
        y++
    } while (y < 5)
}