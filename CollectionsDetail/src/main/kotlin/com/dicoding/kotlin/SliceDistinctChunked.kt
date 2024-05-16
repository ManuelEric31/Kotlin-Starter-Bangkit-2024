package com.dicoding.kotlin

fun main () {
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sliced = total.slice(3..6)
    val slicedStep = total.slice(3..6 step 2)

    val index = listOf(2,3,5,8)
    val sliceIndex = total.slice(index)

    // Menggunakan atribut distinct untuk menyaring item yang sama
    val totalDuplicateList = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = totalDuplicateList.distinct()

    println(sliced)
    println(slicedStep)
    println(sliceIndex)
    println(distinct)

/* output: [4, 5, 6, 7]
* output: [4, 6]
* output: [3, 4, 6, 9]
*  output: [1, 2, 3, 4, 5] */
}