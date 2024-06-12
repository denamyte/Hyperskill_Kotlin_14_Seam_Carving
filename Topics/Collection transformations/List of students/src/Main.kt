fun main() = readln().split(" ")
    .associateWith { it.length }
    .map { "${it.key}->${it.value}" }
    .joinToString(limit = 2, truncated = "*")
    .let(::println)