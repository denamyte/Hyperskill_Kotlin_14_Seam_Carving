// You can experiment here, it won’t be checked

abstract class Animal() {
    abstract fun makeSound(): String
}

class Cat: Animal() {
    override fun makeSound() = "Meow!"
}

class Dog: Animal() {
    override fun makeSound() = "Woof!"
}

fun main() {
    val cat = Cat()
    val dog = Dog()
    val animals = mutableListOf(cat, dog)
    for (animal in animals) {
        println(animal.makeSound())
    }
}
