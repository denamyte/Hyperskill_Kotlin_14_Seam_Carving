// You can experiment here, it won’t be checked

data class Person(val name: String, var age: Int)

fun main() {
    val person = Person("John", 20)
    println(person.age)
    person.age = 21
    println(person.age)
}
