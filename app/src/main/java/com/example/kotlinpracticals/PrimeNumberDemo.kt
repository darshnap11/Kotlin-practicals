package com.example.kotlinpracticals

fun main() {
    val number = 10
    var result = false

    for (i in 2..number / 2){
        if (number % i == 0){
            result = true
            break
        }
    }
    if (!result)
        println("$number is a prime number.")
    else
        println("$number is not a prime number.")

}