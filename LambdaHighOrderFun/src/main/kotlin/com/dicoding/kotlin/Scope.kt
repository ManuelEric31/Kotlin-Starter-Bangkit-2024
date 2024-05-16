package com.dicoding.kotlin

fun main () {
//    lambda receiver
    val dicoding = StringBuilder ()
    dicoding.apply {
        append("Dicoding ")
        append("Academy ")
    }
// lambda argument (it)
    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }
    println(dicoding.toString())
}