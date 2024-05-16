package com.dicoding.kotlin

fun main () {
    val numbers = listOf(1,2,3)

//    Fold memerlukan 2 parameter
    val fold = numbers.fold(10) {
        current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    val foldRight = numbers.foldRight(10) {
            item, current ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    var drop = numbers.drop(3)
    var dropLast = numbers.dropLast(1)
    println(drop)
    println(dropLast)

}

/*
      output:
         current 10
         item 1

         current 11
         item 2

         current 13
         item 3

         Fold result: 16
   */

/*
      output:
         current 10
         item 3

         current 13
         item 2

         current 15
         item 1

         Fold result: 16
   */