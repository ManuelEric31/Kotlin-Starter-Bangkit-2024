package com.dicoding.kotlin

fun main () {
    val dicodingCat = AnimalsInit("Dicoding Miaw", 2.5, 2, true)

    val dicodingBird = AnimalsInit("Dicoding Tweet", 0.5, 1)
}

class AnimalsInit (name: String, weight: Double, age: Int) {
    val name : String
    val weight : Double
    val age : Int
    var isMammal : Boolean

    init {
        this.weight = if (weight < 0) 0.1 else weight
        this.age = if (age < 0) 0 else age
        this.name = name
        this.isMammal = false
    }

    constructor(name : String, weight: Double, age : Int , isMammal : Boolean) : this(name, weight, age) {
        this.isMammal = isMammal
    }
}
