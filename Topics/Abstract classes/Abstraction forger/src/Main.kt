abstract class Employee(val name: String, val surname: String) {
    abstract val age: Int
    abstract fun doWork()

    fun fullName() = "$name $surname"
}

// DO NOT change the code below
class Worker(name: String, surname: String) : Employee(name, surname) {
    override val age = 40

    override fun doWork() {
        println("I am working!")
    }
}

fun main() {
    val name = readln()
    val surname = readln()

    val worker = Worker(name, surname)

    println("My name is: ${worker.fullName()}")
    worker.doWork()
}