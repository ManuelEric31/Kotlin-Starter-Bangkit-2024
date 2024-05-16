package com.dicoding.kotlin

class AnimalsPrivate (private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean = true) {

    fun getName () : String {
        return name
    }
    fun setName (name: String) : Unit {
        this.name = name
    }
}

fun main () {
    val dicodingCat = AnimalsPrivate("Dicoding Miaw", 2.5, 2)
    println(dicodingCat.getName())
    dicodingCat.setName("Goose")
    println(dicodingCat.getName())
}