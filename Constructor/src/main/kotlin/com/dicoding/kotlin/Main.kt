package com.dicoding.kotlin

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

//
    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
    val dicodingCat2 = Animal("Dicoding Miaw", 4.2)
}

// Primary Constructor
class Animal(val name : String, val weight : Double, val age : Int = 0, val isMamal : Boolean =  true)