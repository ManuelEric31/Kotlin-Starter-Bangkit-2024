package com.dicoding.kotlin

//enum class Rainbow(val color : String) {
//    RED("Red"),
//    ORANGE("Orange"),
//    YELLOW("Yellow"),
//    GREEN("Green"),
//    BLUE("Blue"),
//    INDIGO("Indigo"),
//    VIOLET("Violet")
//}

fun main () {
    for (i in 1..3) {
        for (j in 1..i) {
            print(j)
        }
    }
//    println(Rainbow.valueOf("Red"))

    val total = listOf(1, 2, 3, 4, 5, 6)
    val result1 = total.take(5)
    val result2 = result1.takeLast(4)
    val result3 = result2.drop(1)
    val result4 = result3.dropLast(2)
    println(result4)
    println(faktorial(10))
    println(faktorials(10))

}

fun faktorial(n: Int): Int {
    return if (n == 0) 1 else n * faktorial(n - 1)
}

fun faktorials(n: Int): Int {
    if (n == 0) return 1
    return n * faktorials(n - 1)
}

