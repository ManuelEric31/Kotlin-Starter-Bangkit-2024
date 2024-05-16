package com.dicoding.kotlin

fun main () {
    val message = "Kotlin"
    val result = with(message) {
        println("value is $this")
        println("with length ${this.length}")
    }

    val anotherResult = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }

    println(result)
    println(anotherResult)
}