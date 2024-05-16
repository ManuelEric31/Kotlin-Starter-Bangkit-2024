package com.dicoding.kotlin

fun main () {
    val listOfInt = listOf(1,2,3,null,5,6,null,7)

    for (i in listOfInt) {
        if (i == null) continue
        print("i")
    }

    var a = 10

    when (a) {
        // ...
         12 -> print("Ok")
    }
}