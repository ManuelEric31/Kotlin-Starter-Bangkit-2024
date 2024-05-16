package com.dicoding.kotlin

fun main () {
    var stringText : String? = "Dicoding"
    if (stringText != null) {
        println(stringText.length)
    }
    else {
        println(stringText?.length)
    }

    if (stringText is String) {
        println("This subject are ${stringText?.length}" )
    }

    val anotherText: String? = null
    val textLength = anotherText?.length?: 12

    println (textLength)
}