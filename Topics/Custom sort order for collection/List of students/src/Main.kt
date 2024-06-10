fun main() =
    readln().split(" ")
        .sortedWith(compareBy { it.lowercase() })
        .let(::println)
