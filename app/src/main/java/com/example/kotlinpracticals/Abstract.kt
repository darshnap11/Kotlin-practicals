package com.example.kotlinpracticals


abstract class Car{

     abstract fun run()
}

class Honda: Car() {

    override fun run() {
        println("Honda is running.")
    }
}

fun main(){
    val obj = Honda()
    obj.run()





















}

