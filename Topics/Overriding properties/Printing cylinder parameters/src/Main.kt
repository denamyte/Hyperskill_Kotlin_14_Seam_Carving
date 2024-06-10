open class Circle {
    open var radius: Double = 0.0
}

class Cylinder : Circle() {
    override var radius: Double = 0.0
    var height: Double = 0.0
}