package com.dicoding.kotlin

fun main () {
    setWord("Dicoding")
}

fun setWord (message : String) {
//    printMessage () will error
    fun printMessage () {
        println(message)
    }
    printMessage()
}

fun sum (valueA : Int, valueB : Int, valueC: Int) : Int {
    fun Int.validateNumber (value : Int) {
        if (value == 0) {
            throw IllegalArgumentException("Value must be greater than zero")
        }

        validateNumber(valueA)
        validateNumber(valueB)
        validateNumber(valueC)

    }
    return valueA + valueB + valueC


}