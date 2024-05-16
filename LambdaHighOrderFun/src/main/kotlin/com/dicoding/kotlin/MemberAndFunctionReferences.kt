package com.dicoding.kotlin

fun main () {
    val sum: (Int, Int) -> Int = ::count

    val numbers = (1..10)
    val evenNumbers = numbers.filter(::isEvenNumber)
    println(evenNumbers)
}

fun count(valueA: Int, valueB : Int) : Int {
    return valueA+valueB
}

fun isEvenNumber (number : Int) = number % 2 == 0