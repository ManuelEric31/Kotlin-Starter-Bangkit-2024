package com.dicoding.kotlin

data class Item (val key : String, val value : Any)

fun main () {
    val item = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    val distinctItems = item.distinctBy{ it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }
// Menyaring text berdasarkan panjang karakter
    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinctLongChar = text.distinctBy { it.length }

    println(distinctLongChar)

    /*
    output:
        1 with value Kotlin
        2 with value is
        3 with value Awesome
    */

    /*
    output: [A, CC, EEE, GGGG]
    */
}