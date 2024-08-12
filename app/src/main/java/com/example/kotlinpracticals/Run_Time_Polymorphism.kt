package com.example.kotlinpracticals

fun main(){
    var a = Sup()
    a.method1()
    a.method2()

    var b = Sum()
    b.method1()
    b.method2()
}
open class Sup{
    open fun method1(){
        println("Printing method 1 from indise Sup")
    }
    fun method2(){
        println("Printing method 2 from indise Sup")
    }
}

class Sum:Sup(){
    override fun method1() {
        println("Printing method 1 from indise Sum")
    }
}