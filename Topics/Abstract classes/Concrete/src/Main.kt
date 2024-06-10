// Write your solution here
// abstract class Shape {
//     abstract fun calculateArea(): Double
//     abstract fun calculatePerimeter(): Double
//
//     fun printDescription() {
//         println("This is a shape.")
//     }
// }

class Square(val side: Double) : Shape() {
    override fun calculateArea() = side * side
    override fun calculatePerimeter() = side * 4
}
// Do not change the code below
fun main() {    
    val square = Square(readln().toDouble())
    println("Area = ${square.calculateArea()}")
    println("Perimeter = ${square.calculatePerimeter()}")   
}