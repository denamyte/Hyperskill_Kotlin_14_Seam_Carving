fun main() = readln().split(' ')
    .mapNotNull(String::toIntOrNull)
    .maxOrNull()
    .let(::println)