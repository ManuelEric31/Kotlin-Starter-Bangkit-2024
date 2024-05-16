package com.dicoding.kotlin

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val longArrayList = ArrayList<Long>()
    longArrayList.get(0)
}

interface List <T> {
    operator fun get (index : Int) : T
}

class ArrayList <T> : List <T> {
    override fun get (index : Int) : T {
        return this[index]
    }
}