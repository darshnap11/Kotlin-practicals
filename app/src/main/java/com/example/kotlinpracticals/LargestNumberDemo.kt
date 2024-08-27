package com.example.kotlinpracticals

fun main() {

    val a = 10
    val b = 20
    val c = 30

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
