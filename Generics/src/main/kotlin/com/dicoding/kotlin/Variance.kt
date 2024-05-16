package com.dicoding.kotlin

fun main () {

    val car = Car (200)
    val motorCycle = Motorcycle(100)
    var vehicle : Vehicle = car
    vehicle = motorCycle
}

abstract class Vehicle (wheel : Int)
class Car (speed : Int) : Vehicle (4)
class Motorcycle (speed : Int) : Vehicle(2)


// Covariannt menggunakan kata kunci out pada class Generic
interface ListCovariant <out E> : Collection <E> {
    operator fun get (index : Int) : E
}

// Contravariant menggunakan kata kunci in pada class Generic
interface Comparable <in T> {
    operator fun compareTo (other: T) : Int
}