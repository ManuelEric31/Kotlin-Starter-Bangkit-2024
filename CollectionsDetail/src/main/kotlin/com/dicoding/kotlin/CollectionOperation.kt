package com.dicoding.kotlin

fun main () {
    val numberList = listOf(1,2,3,4,5,6,7,8,9,10)
    // memfilter yang dapat dimodulo 2
    val evenList = numberList.filter { it % 2 == 0 }
    // hasil output filter diluar bilangan yang habis dimodulo 2
    val notEvenList = numberList.filterNot { it % 2 == 0 }
    // convert value list menjadi *5
    val multipliedByFive = numberList.map { it * 5 }
//mencari item pertama yang sesuai degnan kondisi
    val firstOddNumber = numberList.find {it % 2 == 1}
// akan mengembalikkan nilai null apabila item tidak ada di list
    val firstOrNullNumber = numberList.firstOrNull{it % 2 == 3}
//    mengecek nilai item setelahnya
    val moreThan = numberList.first{it > 7}

    println(evenList)
    println(notEvenList)
    println(multipliedByFive)
    println(numberList.count())
    println(numberList.count{it % 3 == 0})
    println(firstOddNumber)
    println(firstOrNullNumber)
    println(moreThan)

    /*
    [2, 4, 6, 8, 10]
    [1, 3, 5, 7, 9]
    [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
    10
    3
    1
    null
    8
    */
}