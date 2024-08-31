package com.example.kotlinpracticals
fun main() {
    val name: String = "Darshna Pulpati"
    val char = 'D'
    val frequency = name.count { it == char }

    println("the character is $frequency")


}
