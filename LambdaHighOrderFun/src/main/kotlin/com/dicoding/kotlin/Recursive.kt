package com.dicoding.kotlin

fun main () {
    val factorial = factorialRecursive(3)
    println(factorial)
}

// Not using recursive
fun factorial (n : Int) : Int {
    return if (n ==1) {
        n
    } else {
        var result = 1
        for (i in  1..n) {
            result *= i
        }
        result
    }
}

fun factorialRecursive (n : Int) : Int {
    return if ( n == 1) {
        n
    } else {
        return n * factorialRecursive(n-1)
    }
}

tailrec fun factorialTailRecursion (n : Int, result : Int = 1) : Int {
    val newResult = n*result
    return if (n==1) {
        newResult
    } else {
        factorialTailRecursion (n-1, newResult)
    }
}