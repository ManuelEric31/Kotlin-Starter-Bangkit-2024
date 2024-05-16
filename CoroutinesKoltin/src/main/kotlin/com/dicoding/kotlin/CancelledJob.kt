package com.dicoding.kotlin
import kotlinx.coroutines.*
import java.util.concurrent.CancellationException

@InternalCoroutinesApi
fun main () = runBlocking {
    val job = launch{
        delay(5000)
        println("Start new job!")
    }

    delay(2000)
    job.cancel(cause = CancellationException("Time is Up")) // Langsung memasuki status cancelled
    println("Cancelling Job")
    if (job.isCancelled) {
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
}