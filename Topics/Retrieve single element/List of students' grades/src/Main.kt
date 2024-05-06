//    Read a list of doubles from std.
//    Choose the first number >= 5.0 (or null).
//    Choose the greatest number.
//    Print them separated by a colon.
fun main() {
    val numbers: List<Double> = readLine()!!.split(" ").map { it.toDouble() }
    val firstNumberGreaterOrEqualToFive = numbers.firstOrNull { it >= 5.0 }
    val greatestNumber = numbers.maxOrNull()
    println("$firstNumberGreaterOrEqualToFive:$greatestNumber")
}