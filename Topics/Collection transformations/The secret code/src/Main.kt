fun main() = readln().split(" ")
    .associate { it.first().uppercase() to it.length }
    .let(::println)