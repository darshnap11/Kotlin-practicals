package com.example.kotlinpracticals

fun main(){
    var a = 20
    var b = 40

    a = b.also { b = a }

    println("a is: $a")
    println("b is: $b")
}
