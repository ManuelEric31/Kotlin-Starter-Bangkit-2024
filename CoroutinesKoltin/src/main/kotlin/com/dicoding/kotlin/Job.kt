package com.dicoding.kotlin

import kotlinx.coroutines.*

fun main () = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(100L)
        println("Start new job!")
    }

//    job.start()
    job.join()
    println("Other task")
}