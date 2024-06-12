const val MINIMUM_MARK = 5
fun main() = readln().split(" ").map { it.toDouble() }
    .groupingBy { if (it >= MINIMUM_MARK) "pass" else "fail" }
    .eachCount()
    .let(::println)