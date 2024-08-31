package com.example.kotlinpracticals

fun main(){

    val number = 5
    var fact: Int = 1
    for(x in 1..number) {
        fact *= x
    }
    println("Factorial of $number = $fact")
}