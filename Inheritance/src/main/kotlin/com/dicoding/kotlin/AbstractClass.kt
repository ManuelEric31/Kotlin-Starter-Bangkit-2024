package com.dicoding.kotlin

abstract class AnimalAbstract (val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {
    open fun eat () {
        println("$name sedang makan!")
    }
    open fun sleep () {
        println("$name sedang tidur!")
    }
}

fun main () {

}