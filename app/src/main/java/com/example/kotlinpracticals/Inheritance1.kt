package com.example.kotlinpracticals

open class A (name : String,age : Int){
    init {
        println("My name is Darshna, age is 20")
    }
}
class B (name: String,age: Int,salary : Int): A(name, age){
    fun Website(){
        println("I am a developer")
        println()
    }    }

fun main (){
    val B1 = B("Nainesh", 23, 50000)
    B1.Website()
}