package com.dicoding.kotlin

open class Binatang
class Kucing : Binatang ()

class Kandang <out T : Binatang> (private val hewan : T) {
    fun dapatkanHewan () : T {
        return hewan
    }
}

val kandangKucing : Kandang<Kucing> = Kandang (Kucing())
val kandangBinatang : Kandang<Binatang> = kandangKucing