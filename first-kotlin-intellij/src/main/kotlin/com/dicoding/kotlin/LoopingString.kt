package com.dicoding.kotlin

fun main () {
//    Trying some loop in a string

    val kotlinVar : String = "Kotlin"
    for (char in kotlinVar) {
        print("$char ")
    }
println()
//    Testing Unicode
    val name = "Unicode test: \u00A9"
    println(name)

//    Raw String
    val line = """
        Line 1
        Line 2
        Line 3 
        Line 4
    """.trimIndent()

//    String template if expression
    val hour : Int = 3
    println("Office is ${if(hour < 7) "open soon" else "open"}")
    print(line)
}