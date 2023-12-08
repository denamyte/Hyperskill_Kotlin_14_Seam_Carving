fun main() {
    val input = readln()
    try {
        println(100 / input.toInt())
    } catch (e: Exception) {
        println(when (e) {
            is NumberFormatException -> "You did not enter a valid integer!"
            is ArithmeticException -> "You cannot divide by zero!"
            else -> "An unknown error has occurred!"
        })
    }
}