package com.dicoding.kotlin

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    println(name("Academy"))
    printName("Academy", name)

//    another way
    printName("Academy") {
            value ->
        val first = "Dicoding"

        "$first $value"
    }

    val ranges = (1..10) step 3
    ranges.forEachIndexed { index, _ ->
        println( "Value is $index")
    }

    println(messageLength("Dicoding"))
}


// High - order function
fun printName (value : String, name : (String) -> String) {
    println(name(value))
}

// This is lambda function
val name : (String) -> String = {value ->
    val first = "Dicoding"

    "$first $value"
}

// This is lambda too
val messageLength = { message : String -> message.length }
