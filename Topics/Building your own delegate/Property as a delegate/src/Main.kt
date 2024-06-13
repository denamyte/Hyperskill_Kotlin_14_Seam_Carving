class Car {
    private var _speed = 0
    var speed: Int
        get() = _speed
        set(value) {
            if (value >= 0) {
                _speed = value
                println("Speed set to $value")
            } else {
                println("Speed cannot be negative")
            }
        }

    var acceleration: Int by this::speed
}

class RaceCar(private val car: Car) {

    var boost: Int by car::speed

}
