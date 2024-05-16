package com.dicoding.kotlin
import kotlinx.coroutines.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// runBlocking utk memulai coroutine utama
// launch utk menjalankan coroutine baru

fun main() = runBlocking {
   launch {
       delay(1000L) // Fungsi delay tidak akan memblokir sebuah thread
       println("Coroutines !")
   }
    println("Hello, ")
    delay(2000L) // Delay 2 detik sebelum JVM terminated
}