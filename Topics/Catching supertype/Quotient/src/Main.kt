fun main() {
    val numerator = readln()
    val denominator = readln()
    try {
        val result = numerator.toInt() / denominator.toInt()
        println(result)
    } catch (e: NumberFormatException) {
        println("Numerator and denominator must be valid integers.")
    } catch (e: ArithmeticException) {
        println("Cannot divide by zero!")
    } catch (e: Exception) {
        println(e.message)
    }
}