package com.dicoding.kotlin

class User (val name : String, val age : Int) {
    override fun toString () : String {
        return "User (name = $name, age = $age)"
    }
}

data class DataUser (val name : String , val age : Int) {
    fun intro () : Unit {
        println("My name is $age and My age is $age")
    }
}

fun main() {
    val user = User("Joko", 20)
    val dataUser1 = DataUser("Uus", 25)
    val dataUser2 = DataUser("Uus", 25)
    val dataUser3 = dataUser1.copy()
    val dataUser4 = dataUser2.copy(age = 22)

//    Memetakan menggunakan component N
    val name = dataUser1.component1()
    val age = dataUser1.component2()

    println(user)
    println(dataUser1)
    println(dataUser1.equals(dataUser2)) // Membadingkan kedua objek, apabila menggunakan class biasa hanya membandingkan referensi memori saja
    println(dataUser3)
    println(dataUser4)
    println(dataUser1.intro())

//    Print yang sudah dipertakan
    println("My name in Data User 1 is $name and My age is $age")
}
