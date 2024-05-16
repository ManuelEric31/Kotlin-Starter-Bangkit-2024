package com.dicoding.kotlin

class Animals {
    var name : String by DelegeateName()
}

class Person {
    var name : String by DelegeateName()
}
fun main () {
    val animal = Animals()
    animal.name = "Dicoding Miaw"
    println("Nama Hewan ${animal.name}")

    val person = Person()
    person.name = "Dimas"
    println("Nama Orang ${person.name}")
}