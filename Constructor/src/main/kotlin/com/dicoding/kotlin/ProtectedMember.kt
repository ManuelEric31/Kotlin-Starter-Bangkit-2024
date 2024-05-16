package com.dicoding.kotlin

open class AnimalsProtected (val name :String, protected val weight: Double)

class Cat (pName: String, pWeight: Double) : AnimalsProtected(pName, pWeight)

fun main () {
    val cat = Cat("Dicoding Miaw", 2.0)
    println("Nama Kucing: ${cat.name}")
//    println("Nama Kucing: ${cat.weight}") // error : expecting a top level declaration
}

