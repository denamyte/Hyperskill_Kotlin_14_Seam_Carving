fun main() = readln().split(" ")
    .filter { it == it.reversed() }
    .let(::println)