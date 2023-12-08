fun main() {
    val input = readlnOrNull()
    try {

        val n = input!!.toInt()
        if (n < 0) throw IllegalArgumentException()
        println(n * n)

    } catch (e: Exception) {
        when (e) {
            is NumberFormatException -> println("The input must be a valid integer.")
            is IllegalArgumentException -> println("The number must be non-negative.")
            else -> println("Unknown error has happened!")
        }
    }
}