package com.dicoding.kotlin

fun main () {
    val color : Colors = Colors.RED
    println("Color is $color")
    println("Color value os  ${color.value.toString(16)}")

    val objectColors : Array <Colors> = enumValues()
    objectColors.forEach {colored -> println(colored) }

    val ordinalColor : Colors = Colors.GREEN
    println("Position green is ${ordinalColor.ordinal}")  // Untuk mengakses ordinal
}

enum class Colors (val value : Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}