// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  val c = Class.c
}

open class Person {
    protected open val name: String = ""
    private val age: Int = 0
}

class Student : Person() {
//    override val age = 18 // age is private and this will NOT work
    override val name = "Eyad" // this will work
}

class Teacher {
    private val person = Person()

    fun printPerson(): String {
        return person.name // Cannot access 'name': it is protected in 'Person'
    }
}

class Class private constructor(val a: String) {
    companion object {
        val c = Class("abc")
    }
}