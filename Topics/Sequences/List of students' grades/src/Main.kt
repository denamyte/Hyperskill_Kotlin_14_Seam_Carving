fun main() = readln().split(" ")
    .map { it.toDouble() }.asSequence()
    .filter { it > 5 }
    .average()
    .let(::println)