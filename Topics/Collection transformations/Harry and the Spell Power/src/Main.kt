fun main() = readln().split(" ")
    .map { it.split("-") }
    .map { Pair(it[0], it[1]) }
    .joinToString("-", "|", "|")
    .let(::println)