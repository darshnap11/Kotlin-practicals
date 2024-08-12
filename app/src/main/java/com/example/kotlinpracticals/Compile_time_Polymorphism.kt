package com.example.kotlinpracticals

fun main(){
    println(doubleOf(4.0))
    println(doubleOf(4.3))
    println(doubleOf(4.323))
}
fun doubleOf(a: Int):Int{
    return 2*a
}
fun doubleOf(a:Float):Float {
    return 2*a
}
fun doubleOf(a:Double):Double{
    return 2.00*a
}