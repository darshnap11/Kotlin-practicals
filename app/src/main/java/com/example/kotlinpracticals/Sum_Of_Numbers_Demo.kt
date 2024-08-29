package com.example.kotlinpracticals

fun main() {
    var Sum = 0.0

    for (i  in 1..5){
        println("Enter number $i: ")
        val number = readLine()?.toDoubleOrNull()?:0.0
        Sum  += number
    }
    println("The Sum of thr 5 numbers is :$Sum")
}