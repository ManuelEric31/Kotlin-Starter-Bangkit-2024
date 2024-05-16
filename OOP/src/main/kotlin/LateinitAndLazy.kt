package com.dicoding.kotlin

lateinit var name : String
val lazyName : String by lazy {
    "Dicoding Miaw"
}
fun main () {
    name = "Dicoding Miaw"
    print(name.length)
}