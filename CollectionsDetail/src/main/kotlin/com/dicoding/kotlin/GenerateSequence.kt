package com.dicoding.kotlin

// Sequence biasa disebut lazy evaluation, dimana iterasi hanya dilakukan apabila dibutuhkan

fun main () {

//    Apabila tidak menggunakan takes maka generateSequence akan membuat list tak terbatas
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it") }
}
