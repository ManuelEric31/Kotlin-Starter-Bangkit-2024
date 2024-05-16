package com.dicoding.kotlin

fun main () {

//    Calling function without infix
    println(10.plusThree())
    println(10.slice)
    var result = 5 sum 3
    println(result)
}

fun Int.plusThree() : Int {
    return this + 3
}

val Int.slice : Int
    get() = this/2

// Infix Function
infix fun Int.sum (value : Int) : Int {
    return this + value
}

class MyHero {
    infix fun addHero (s: String) {/*...*/}
    fun build () {
        this addHero "Superman"
        addHero("Spiderman")
    }
}