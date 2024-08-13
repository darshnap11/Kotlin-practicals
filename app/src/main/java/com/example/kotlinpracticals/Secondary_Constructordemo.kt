package com.example.kotlinpracticals

//Secondary Constructor
fun main(){
    Add1(5,6)

    //two primary constructor
    employee(1010,"Nandani")
    employee1(2020, "Snehal",60000.5)

    //Three Secondary Constructor in a class
    Add2(5,6)
    Add2(5,6,7)
    Add2(5,6,7,8)

    //calling one secondary constructor from another
    Sub(10,5)

    //calling parent class secondary constructor from child class secondary constructor
    Child(4444, "Darshna")
}

//Secondary Constructor
class Add1
{
    constructor(a: Int, b: Int)
    {
        var c : Int = a + b
        println("The sum of two number's is: $c")
        println()
    }
}
//two primary constructor
class employee1 {
    constructor(emp_id: Int, emp_name: String) {
        var id: Int = emp_id
        var name: String = emp_name

        println("Employee id is : $id,")
        println("Employee name : $name,")
    }

    constructor(emp_id: Int, emp_name: String, emp_salary: Double) {
        var id: Int = emp_id
        var name: String = emp_name
        var salary: Double = emp_salary
        println("Employee id is : $id,")
        println("Employee name : $name,")
        println("Employee name : $salary")
        println()
    }
}
//Three Secondary Constructor in a class

class Add2{
    constructor(a: Int , b : Int)
    {
        var c = a + b
        println("Sum of two number's is = $c")
    }
    constructor(a:Int , b : Int, c : Int)
    {
        var d = a + b + c
        println("Sum of three number's is = $d")
    }
    constructor(a:Int , b : Int, c : Int, d: Int)
    {
        var e = a + b + c + d
        println("Sum of four number's is = $e")
        println()
    }

}

//calling one secondary constructor from another
class Sub{
    constructor(a: Int , b : Int ): this(a,b,3){
        var subOfTWO = a - b
        println("The sub of two numbers is : $subOfTWO")
        println()
    }
    constructor(a: Int,b: Int,c: Int){
        var subOfThree = a - b - c
        println("The sub of three numbers is : $subOfThree")
    }
}

//calling parent class secondary constructor from child class secondary constructor

open class Parent {
    constructor (emp_id: Int, emp_name: String,emp_salary: Double) {
        var id: Int = emp_id
        var name: String = emp_name
        var salary : Double = emp_salary
        println("Employee id is: $id")
        println("Employee name: $name")
        println("Employee salary: $salary")
        println()
    }
}
class Child : Parent {
    constructor (emp_id : Int, emp_name: String):super(emp_id,emp_name,50000.50){
        var id: Int = emp_id
        var name: String = emp_name

        println("Employee id is: $id")
        println("Employee name: $name")

    }
}