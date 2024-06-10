abstract class Shape {
    abstract val area: Int
}

class Square(val side: Double) : Shape() {
    override val area
        get() = side.toInt().let { it * it }
}
