package com.dicoding.kotlin

import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var color = Color.BLUE

// when keyword
    when (color) {
        Color.RED -> println("Warna Merah")
        Color.GREEN -> println("Warna Hijau")
        Color.BLUE -> println ("Warna Biru")
    }

    val value = 20

    when (value) {
        6 -> {
            println("Enam")
        }
        7 -> println("Tujuh")
        8 -> println("Delapan")
        9 -> println("Sembilan")
        else -> println("Default Option")
    }

//    When dan is keyword
    val anyType : Any = 100L
    when (anyType) {
        is Long -> println("The value has a long type")
        is Int -> println("The value has a int type")
        is Float -> println("The value has a float type")
        else -> println("Undefined")
    }

//    When dan range
    val valueTemp = 27
    val rangeTemp = 1..50

    when (valueTemp) {
        in rangeTemp -> println("$valueTemp is in range!")
        !in rangeTemp -> println("$valueTemp is not in range!")
        else -> println("Not Provided")
    }


//    Membuat looping ranges
    val ranges = 1..5
    for (i in ranges) {
        println("Nilai saat ini adalah $i !")
    }

//    Membuat when, if, dan in

    val registeredNumber = when(val regis = randomizeNumber()) {
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

}

enum class Color {
    RED, GREEN, BLUE
}

fun randomizeNumber () = Random.nextInt(100)