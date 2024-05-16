package com.dicoding.kotlin

fun stringText (first: String, middle: String, last: String) : String {
    return "$first $middle $last"
}

fun defaultArguement (first: String = "Manuel", middle: String = "Eric", last: String = "Saputra") : String {
    return "$first $middle $last"
}
fun main () {
//    Create named arguement
    val fullname: String = stringText(middle = "Jessica", first = "Bastiaans", last = "Carmelita")
    println(fullname)

    val anotherFullName: String = defaultArguement()
    println (anotherFullName)
}