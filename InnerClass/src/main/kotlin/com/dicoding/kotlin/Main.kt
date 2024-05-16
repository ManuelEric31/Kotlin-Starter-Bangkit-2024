package com.dicoding.kotlin

class House {
    val buildingArea = 100 // Wajib diinisialisasi terlebih dahulu
    val totalRooms = 20
    
    inner class Room {
        val totalRooms = 4
        fun measureArea () {
            println(buildingArea/this@House.totalRooms)
        }
    }
}

fun main() {
    val house = House()
    val room = house.Room()
    room.measureArea()
}