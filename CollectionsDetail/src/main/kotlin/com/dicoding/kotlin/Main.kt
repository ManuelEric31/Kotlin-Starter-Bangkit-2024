package com.dicoding.kotlin

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numberList : List<Int> = listOf(1,2,3,4,5)
    val anyList : List<Any> = listOf('a', "Kotlin", 3, true)

//    Mutable List (Bisa dimanipulasi)
    val anyListMutable = mutableListOf('a', "Kotlin", 3, true)

    anyListMutable.add('d')
    anyListMutable.add(1, "Love")
    anyListMutable[3] = false // mengubah nilai item pada indeks ke-3
    anyListMutable.removeAt(0) // menghapus item pada indeks ke-0
}