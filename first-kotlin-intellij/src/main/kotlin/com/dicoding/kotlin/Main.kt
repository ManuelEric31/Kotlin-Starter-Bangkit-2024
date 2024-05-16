package com.dicoding.kotlin

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }

    var nama = "Arif"
    var umur: Int = 20
    var charAlpha : Char = 'A'
    charAlpha++

    println("Hello $nama dan umurku $umur tahun dan mengucapkan kata $charAlpha")
//    Create nullable type
    val nullabeVariable: String? = null

//    Safe call operator, memanggil null dengan aman
    val textLength = nullabeVariable?.length

//    Create nullable type
    val tryElvisOperator : String? = null
    val defaultValue = tryElvisOperator?.length?:0

//    Mencoba Collection
//    List
    val integerList = listOf(4,2,3,5,6)
    println(integerList[3])

//    Set
    val integerSet = setOf(2,1,3,4,5)

//    Map
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(capital["Jakarta"])

}