package com.example.kotlinpracticals

fun main() {
    val numbers = arrayOf(10,20,30,40,50)
    val sum = numbers.sum()
    val average = sum.toDouble() / numbers.size

    println("The average is : $average")
}