fun main() = readln().split(" ")
    .map { it.toDouble() }
    .run { "${max()}:${min()}:${average()}" }
    .let(::println)