package com.dicoding.kotlin

fun main () {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

//    Merubah map menjadi mutable
    val mutableCapital = capital.toMutableMap()

    println(capital.getValue("Jakarta"))
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

    // Output: Indonesia
    val mapKeys = capital.keys

    // mapKeys: [Jakarta, London, New Delhi]

    println(mapKeys)

    val mapValues = capital.values
    println(mapValues)
// mapValues: [Indonesia, England, India]
}