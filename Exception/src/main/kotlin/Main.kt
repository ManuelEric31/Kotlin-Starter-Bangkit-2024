package com.dicoding.kotlin

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val someNullValue : String? = null
    lateinit var SomeMustNotNullValue : String

    try {
        SomeMustNotNullValue = someNullValue!!
        println(SomeMustNotNullValue)
    } catch (e : Exception) {
        SomeMustNotNullValue = "Nilai String Null"
        println(SomeMustNotNullValue)
    }
}