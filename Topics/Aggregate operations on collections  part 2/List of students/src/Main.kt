fun main() =
    readln().split(" ")
        .maxWithOrNull(naturalOrder())
        .let(::println)