// You can experiment here, it won’t be checked

class Example {
    private var _counter = 0
    var counter: Int
        get() = _counter
        set(value) {
            _counter = value
            println("Counter set to $value")
        }

    var anotherCounter: Int by this::counter
}

fun main() {
    val example = Example()
    example.anotherCounter = 5 // Counter set to 5

    println(example.counter)
}
