fun main() = readln().split(" ")
    .filter { Regex("blue|red").matches(it) }
    .let(::println)