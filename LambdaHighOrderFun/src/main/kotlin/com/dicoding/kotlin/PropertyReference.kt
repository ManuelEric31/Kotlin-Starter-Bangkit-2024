package com.dicoding.kotlin

// Mutable
var message = "Kotlin"

// Immutable
val immutableMessage = "Kotlin"
fun main () {
    println(::message.name)
    println(::message.get())

    ::message.set("Kotlin Academy")

    println(::message.get())

    println(::immutableMessage.name)
    println(::immutableMessage.get())
    // ::message.set("Kotlin Academy") <- Error : Unresolved reference.

}