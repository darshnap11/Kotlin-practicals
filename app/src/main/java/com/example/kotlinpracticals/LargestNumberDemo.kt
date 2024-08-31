package com.example.kotlinpracticals

fun main() {

    val a = 5
    val b = 30
    val c = 10

    if(a>b && a>c) {
        println("a is the largest number")
    }
    else if (b>a && b>c) {
        println("b is the largest number")
    }
    else{
        println("c is the largest number")
    }
}
