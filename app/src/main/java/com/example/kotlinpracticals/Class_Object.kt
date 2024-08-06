package com.example.kotlinpracticals

class studentclass {
    var name = "Darshna"
    var roll = 10
    var marks = 50

    fun student() {
        println("student name is:$name")
        println("Darshna roll no is:$roll")
        println("Darshna marks is:$marks")
    }
}

 fun main(){
    var obj = studentclass()
    obj.student()
}
