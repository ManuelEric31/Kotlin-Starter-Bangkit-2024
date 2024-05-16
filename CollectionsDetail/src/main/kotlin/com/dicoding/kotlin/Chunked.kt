package com.dicoding.kotlin

fun main () {
    val word = "QWERTY"
    val chunked = word.chunked(3)

    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }

    println(chunked)
    println(chunkedTransform)
}

/*
    output:[QWE, RTY]
    output: [qwe, rty]
*/