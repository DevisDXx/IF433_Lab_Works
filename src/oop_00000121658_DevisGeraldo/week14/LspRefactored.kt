package oop_00000121658_DevisGeraldo.week14

interface Shape {
    fun area(): Int
}

class SafeRectangle(val width: Int, val height: Int) : Shape {
    override fun area() = width * height
}

class SafeSquare(var side: Int) : Shape {
    override fun area() = side * side
}