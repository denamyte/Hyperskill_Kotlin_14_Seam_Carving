fun main() = readln().split(" ")
    .map { it.toInt() }
    .sortedBy { -it % 2 }
    .let(::println)