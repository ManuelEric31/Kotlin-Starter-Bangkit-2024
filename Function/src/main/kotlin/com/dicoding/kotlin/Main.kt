package com.dicoding.kotlin

fun setUser (name: String, age: Int) : String {
    return "Your name is $name, and your age is $age years old"
}

fun setUserAlter (name: String, age: Int) = "Your name is $name, and your age is $age years old"

fun setPrintUnit (name: String) : Unit {
    println("Your name is $name")
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(setUserAlter("Joko", 20))
    setPrintUnit("Joko")
}