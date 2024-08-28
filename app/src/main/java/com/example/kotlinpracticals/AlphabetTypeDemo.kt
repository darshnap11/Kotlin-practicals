package com.example.kotlinpracticals

fun main(){
 val ch = 'b'
    val vowelConsonant = if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||
        ch == 'u') {
        "vovel"
    }
    else {
        "consonant"
    }

    println("$ch is $vowelConsonant")

}