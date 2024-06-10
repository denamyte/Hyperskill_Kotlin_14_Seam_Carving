fun main() =
    readln().split(" ")
        .sortedBy { it.length }.reversed()
        .let(::println)
