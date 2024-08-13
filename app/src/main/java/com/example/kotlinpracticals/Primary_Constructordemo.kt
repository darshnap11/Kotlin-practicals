package com.example.kotlinpracticals

//primary constructor

fun main() {
    val add = Add(5,6)
  println("The Sum of numbers 5 and 6 is :${add.c}")

//Primary Constructor with Initializer Block
    val person = person ("Darshna")

//Default Value in primary constructor
    val emp = employee(1000,"Darshna")
    val emp2 = employee(2000)
    val emp3 = employee()
}

//Primary Constructor
class Add constructor(a: Int ,b:Int)
{
   var c = a+b;
}

//Primary Constructor with Initializer Block
class person (val_name: String) {
    var name: String

    init {
        println("This is first init block")
    }

    init {
        println("This is second init block")
    }

    init {
        println("This is third init block")
    }

    init {
        this.name = "Darshna"
        println("Name = $name")
    }}

//Default Value in primary constructor
class employee(emp_id:Int = 100 , emp_name : String= "abc"){
    val id : Int
    var name : String
    init {
        id = emp_id
        name = emp_name
        println("Employee id is : $id")
        println("Employee name :  $name")
        println()
    }
}

