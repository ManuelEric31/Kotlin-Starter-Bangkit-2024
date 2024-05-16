package com.dicoding.kotlin

fun main () {
    val value : Int? = null

    println(value.slice)

    val value2 : Int = 20
    println(value2.sliceElvis)

    val value3 : Int? = null
    println(value3?.sliceSafe)
}

// Without elvis operator
val Int?.slice : Int
    get() = if (this == null) 0 else this.div(2)

// With elvis operator
val Int?.sliceElvis : Int
    get() = this?.div(2) ?: 0

val Int.sliceSafe : Int
    get() = this.div(2)