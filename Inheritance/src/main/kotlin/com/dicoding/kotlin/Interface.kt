package com.dicoding.kotlin

interface IFly {
    fun fly()
    var numberOfWings : Int
}

class Bird (override var numberOfWings: Int): IFly {
    override fun fly () {
        if (numberOfWings > 0)
            println("Bird is flying using $numberOfWings wings")
        else
            println("Bird is flying without wing")
    }

}

fun main () {
    var birdValue = Bird(2)
    println(birdValue.fly())
}