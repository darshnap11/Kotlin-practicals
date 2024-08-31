package com.example.kotlinpracticals

fun main (){
    val objchild = child()
    objchild.myMethod()
    objchild.myMethod2()
}

open class parent
{
    init{
        println("parent constuctor is calld")
    }
    val name :String = ""

    fun myMethod(){
        println("i am parent")
    }
}

class child : parent()
{
    init{
        println("parent constuctor is calld")
    }
    val name2 : String = ""

    fun myMethod2(){
        println("i am child")
    }
}
