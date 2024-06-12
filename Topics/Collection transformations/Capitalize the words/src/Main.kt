fun main() = readln().split(" ")
    .associateBy { it.first().uppercase() }
    .let(::println)