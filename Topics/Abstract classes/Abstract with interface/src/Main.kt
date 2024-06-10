// write your solution here
class Guitar(name: String) : Portable, Instrument(name) {
    override fun carry() {
        println("Carrying the $name")
    }

    override fun play() {
        println("Playing the $name")
    }

}

// Do not change code below
abstract class Instrument(val name: String) {
    abstract fun play()
}

interface Portable {
    fun carry()
}

fun main() {
    val name = readln()
    val guitar = Guitar(name)
    guitar.play()
    guitar.carry()
}