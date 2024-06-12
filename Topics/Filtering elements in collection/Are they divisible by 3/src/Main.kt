fun main() = readln().split(" ").map { it.toInt() }
    .filter { it % 3 == 0 }
    .let(::println)