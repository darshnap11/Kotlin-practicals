package com.example.kotlinpracticals

fun main() {
    var count = 0
    var number = 1762387

    println("The Number is : $number")

    while (number != 0){
        number /= 10
        count++
    }
    println("Number of Digits: $count")
}