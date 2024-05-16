package com.dicoding.kotlin

interface IFly {
    fun fly ()
}

fun flyWithWings (bird : IFly) {
    bird.fly()
}

//class Bird : IFly {
//    override fun fly() {
//        println("The Bird is Flying")
//    }
//}

fun main () {
    flyWithWings(object : IFly {
        override fun fly() {
            println("The Bird Is FLying")
        }
    })
}