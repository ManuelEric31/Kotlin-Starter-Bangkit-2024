package com.dicoding.kotlin

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    SingletonCentralLibrary.borrowBookById(21)
    CompanionObject.borrowBookById(22)
    val libraryName = MyLibrary.LIBRARY_NAME
}

object SingletonCentralLibrary {
    fun borrowBookById (id : Int) {
        println("Book with $id has been borrowed")
    }
}

// Make companion object

class CompanionObject {
    companion object {
        fun borrowBookById (id : Int) {
            println("Book with $id has been borrowed")
        }
    }
}

class MyLibrary {
//     Const 'val' are only allowed on top level, in named objects, or in companion object
//     const val LIBRARY_NAME = "Dicoding Library"

    fun totalBook () {
        println("Total book in $LIBRARY_NAME is unlimited")
    }

    companion object {
        const val LIBRARY_NAME = "Dicoding Library" // Penamaan konstanta sebaiknya menggunakan huruf kapital
    }
}