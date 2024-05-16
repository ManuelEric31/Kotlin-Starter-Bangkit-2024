package com.dicoding.kotlin

class Calculator {
    fun add (value1 : Int, value2: Int) = value1 + value2
    fun add (value1 : Int, value2: Int, value3: Int) = value1 + value2 + value3
    fun add (value1 : Double, value2: Double) = value1 + value2
    fun add (value1 : Double, value2: Double, value3: Double) = value1 + value2 + value3

    fun min (value1 : Int, value2 : Int) = if (value1 < value2) value1 else value2
    fun min (value1 : Double, value2 : Double) = if (value1 < value2) value1 else value2
}

fun main () {
    val calc = Calculator()

    println(calc.add(2,4))
    println(calc.add(2.5,4.5))
    println(calc.add(2,4, 4))
    println(calc.add(3.3, 1.2, 4.2))

    println(calc.min(9,2))
    println(calc.min(9,2))
    println(calc.min(11.9,12.2))
}