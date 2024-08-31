package com.example.kotlinpracticals

fun main() {
    val number = 12321
    var revNumber = 0
    var temp = number

    while (temp > 0){
        val remainder = temp % 10
        revNumber = (revNumber * 10) + remainder
        temp = temp / 10
    }
    if (number == revNumber){
        println("Number is palindrome")
    }
    else{
        println("Number is not palindrome")
    }
}