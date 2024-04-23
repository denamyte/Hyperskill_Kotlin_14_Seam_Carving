fun add(x: Int, y: Int) = x + y

fun subtract(x: Int, y: Int) = x - y

fun divide(x: Int, y: Int) = x / y

fun multiply(x: Int, y: Int) = x * y

private val calcMap = mapOf(
    "add" to ::add,
    "subtract" to ::subtract,
    "divide" to ::divide,
    "multiply" to ::multiply,
)

fun calculate(x: Int, y: Int, operator: (Int, Int) -> Int) = print(operator(x, y))

fun main() {
    val x: Int = readln().toInt()
    val y: Int = readln().toInt()
    calculate(x, y, calcMap[readln()]!!)
}