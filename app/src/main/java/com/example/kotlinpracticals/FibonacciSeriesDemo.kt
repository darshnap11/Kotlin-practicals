package com.example.kotlinpracticals

fun main() {
    val number = 5
    var a = 0
    var b = 1

    for(i in 1..number){
        print("$a")
        val sum = a + b
        a = b
        b = sum

    }
}