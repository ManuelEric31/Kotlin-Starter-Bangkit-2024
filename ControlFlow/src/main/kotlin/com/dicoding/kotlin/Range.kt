package com.dicoding.kotlin

fun main () {
    val rangeint = 1..10 step 3
    rangeint.forEach {
        print("$it ")
    }
    println(rangeint.step)

//    Alternative dari operator (..)
    val rangeUpAlter = 1.rangeTo(10)
    val rangeDownAlter = 10.downTo(1)

    if (7 in rangeUpAlter) {
        println("Value 7 Available!")
    }

    if (-2 !in rangeDownAlter) {
        println("Value -2 Not Available!")
    }

//    range and step

    val rangeStep = 1.rangeTo(10) step 3

    for (i in rangeStep) {
        println("Value is $i")
    }

//    withIndex()

    val rangeStepWithIndex = 1.rangeTo(10) step 3
    for ((index, value) in rangeStepWithIndex.withIndex()) {
        println("Value $value with index $index")
    }

//    Foreach instead of for loop
    val rangeForEach = 1.rangeTo(10) step 3
    rangeForEach.forEach {
        values -> println("Value is $values")
    }

}