package com.example.kotlinpracticals

fun main(){
    val obj1 = Car1()
    obj1.start()
    obj1.stop()

 //example to demonstrate default value and default methods
val obj = Interfacedemo()
    println(obj.add(5))
    obj.print()

//example to demonstrate interface properties
    val x = PropertiesDemo()
    println(x.a)
    println(x.b)

//example to demonstrate interface inheritance
    val obj2 = XYZ()
    obj2.area()
    obj2.perimeter()

//example to demonstrate multiple interface implementation
    val obj3 = MultipleInterface()
    obj3.description()

}

interface Vehicle{
     fun start()
     fun stop()
}

class Car1 : Vehicle{
    override fun start() {
        println("Car started")
    }

    override fun stop() {
        println("Car stopped")
        println()
    }
}

//example to demonstrate default value and default methods
interface FirstInterface {
    fun add(a: Int , b:Int = 5)
    fun print()
    {
        println("This is a default method defined in the interface")
    }
}
class Interfacedemo : FirstInterface {
    override fun add(a: Int, b: Int) {
        val x = a + b
        println("SUm is $x")
    }

    override fun print() {
        super.print()
        println("It has been overridden")
        println()
    }
}

//example to demonstrate interface properties
interface InterfaceProperties {
    val a : Int
    val b : String
        get() = "Hello"
}

class PropertiesDemo : InterfaceProperties {
    override val a : Int = 5000
    override val b : String = "Property Overridden"
}


//example to demonstrate interface inheritance
interface Dimensions {
    val length : Double
    val breadth : Double
}

interface CalculateParameters : Dimensions {
    fun area()
    fun perimeter()
}

class XYZ : CalculateParameters {
    override val length : Double
        get() = 10.0
    override val breadth : Double
        get()= 15.0

    override fun area()
    {
        println()
        println("Area is ${length * breadth}")
    }

    override fun perimeter()
    {
        println("Perimeter is ${2*(length+breadth)}")
        println()
    }
}

//example to demonstrate multiple interface implementation
interface InterfaceProperties1 {
    val a : Int
    val b : String
        get() = "Hello"
}

interface InterfaceMethods {
    fun description()
}

class MultipleInterface : InterfaceProperties, InterfaceMethods {
    override val a : Int
        get() = 50

    override fun description()
    {
        println("Multiple Interfaces implemented")
    }
}
