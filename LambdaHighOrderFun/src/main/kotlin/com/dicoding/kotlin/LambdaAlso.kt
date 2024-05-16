package com.dicoding.kotlin

fun main () {
    val text = "Hello Kotlin"
    val result = text.also {
        println("Value legth -> ${it.length}")
    }
    println("text-> $result")
}