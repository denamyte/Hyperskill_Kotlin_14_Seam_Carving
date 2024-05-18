// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  // put your code here
}

open class Person(val name: String) {
    var age: Int = 0

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }
}

class Employee(name: String, age: Int, val id: Int): Person(name, age)
