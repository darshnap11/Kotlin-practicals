package com.example.kotlinpracticals

import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.ShapeableViewShapeProvider

fun main(){
    val Circle: Shape= Circle(4.0)
    val Square: Shape= Square(4.0)

    val Shapes : Array<Shape> = arrayOf(Circle(3.0), Square(4.0),
        Triangle(3.0,4.0))
    calculateAreas(Shapes)
}
 fun calculateAreas(Shapes: Array<Shape>){
     for(Shape : Shape in Shapes){
         println(Shape.area())
     }
 }

open class Shape{
    open fun area() :Double{
        return 4.0
    }
}

class Circle(val radius:Double) : Shape(){
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square(val side:Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

class Triangle(val base:Double, val height : Double):Shape(){
    override fun area(): Double {
        return 0.5 * base * height
    }
}
