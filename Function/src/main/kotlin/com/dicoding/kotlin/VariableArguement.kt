package com.dicoding.kotlin

fun varArguement (vararg numbers: Int) : Int {
    return numbers.sum()
}

// Menggunakan vararg gabungan array
fun varargArray (vararg number: Int ) : Int {
    return number.sum()
}
fun main () {
    var summary : Int = varArguement(10,20,200)
    println(summary)

//    Vararg Array
    var arrayA = intArrayOf(10,20,30)
    var summaryArrayA = varargArray(*arrayA, 20)
    println(summaryArrayA)
}