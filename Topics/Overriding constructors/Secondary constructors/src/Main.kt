// AI instructions:
//    Create an OPEN class Animal with properties name and age.
//    Create a class Dog, which inherits Animal.
//    In this class define a property breed and initialize it to "".
//    Create a secondary constructor and assign the additional property in it.

//   This instruction creates wrong Animal class without "OPEN" hint

open class Animal(val name: String, val age: Int)

class Dog(name: String, age: Int) : Animal(name, age) {
    var breed: String = ""

    constructor(name: String, age: Int, breed: String) : this(name, age) {
        this.breed = breed
    }
}