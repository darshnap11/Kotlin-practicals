package com.example.kotlinpracticals

fun main(){

    val number = 10
    var fact: Long = 1
    for(x in 1..number) {
        fact *= x.toLong()
    }
    println("Factorial of $number = $fact")
}