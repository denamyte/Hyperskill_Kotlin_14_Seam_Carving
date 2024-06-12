fun main() = readln().split(" ")
    .map { it.toInt() }.asSequence()
    .filter { it % 2 == 1 }
    .map { it * 2 }
    .chunked(2)
    .map { it.sum() }
    .toList()
    .let(::println)