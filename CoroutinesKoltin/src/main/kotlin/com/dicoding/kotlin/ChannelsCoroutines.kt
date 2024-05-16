package com.dicoding.kotlin

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun main () = runBlocking {
    val channel = Channel<Int>()
        launch(CoroutineName("v1coroutine")) {
            println("Sending from ${Thread.currentThread().name}")
            for (x in 1..5) channel.send(x * x)
        }
        repeat(5) { println(channel.receive()) }
        println("Received in ${Thread.currentThread().name}")
    }