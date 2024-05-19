// The AI instructions
//    Create an OPEN Animal class with a primary constructor
//    that takes two parameters: name and age. Then create
//    a subclass Dog that uses the superclass constructor.

// Without the hint in uppercase the AI creates a wrong class definition

open class Animal(val name: String, val age: Int)

class Dog(name: String, age: Int) : Animal(name, age)