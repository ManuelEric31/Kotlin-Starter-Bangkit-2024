package com.dicoding.kotlin

fun main () {
    val dicoding = "Dicoding".firstAndLast()
    val first = dicoding["first"]
    val last = dicoding["last"]
    println("Pertama $first Terakhir $last")

    val dicodingProperties = "Gedhang".firstAndLastString
    val firstProperties = dicodingProperties["first"]
    val lastProperties = dicodingProperties["last"]
    println("Pertama $firstProperties Terakhir $lastProperties")

}

// Extension Function
fun String.firstAndLast () : Map<String,Char> {
    return mapOf(
        "first" to first(),
        "last" to last()
    )
}

val String.firstAndLastString : Map<String, Char>
    get () = mapOf(
        "first" to first(),
        "last" to last()
    )