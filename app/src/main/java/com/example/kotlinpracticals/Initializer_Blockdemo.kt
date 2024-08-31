package com.example.kotlinpracticals

fun main(){
    var person1 = Person("Darshna",21)

}
class Person(fName : String, personAge: Int){
    val firstname = fName
    var age = personAge
    
    init {
        println("First Name = $firstname")
        println("Age = $age")
    }

}