package com.dicoding.kotlin

fun main () {
    val message : String? = null
    val length = message?.length ?: 0 * 2
    val text = "Text length $length"
    println(text)

    val messages : String? = null
    messages?.let {
        val length = it.length * 2
        val text = "Text length $length"
        println(text)
    } ?: run {
        val text = "Message is null"
        println(text)
    }
}