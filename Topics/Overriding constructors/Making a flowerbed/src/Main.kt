open class Plant(val name: String)

open class Flower(val color: String, name: String) : Plant(name)

class Flowerbed(color: String, name: String) : Flower(color, name) {
    fun print() {
        println("This flowerbed has many $color ${name}s")
    }
}
