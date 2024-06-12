fun main() = readln().split(" ").asSequence()
    .map { it.split("-") }
    .map { Pair(it[0], it[1].toInt()) }
    .filter { it.second > 20 }
    .map { it.first }
    .sorted().toList()
    .let(::println)