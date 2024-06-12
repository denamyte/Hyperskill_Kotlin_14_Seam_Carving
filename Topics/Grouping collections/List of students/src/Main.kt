fun main() = readln().split(" ")
    .groupingBy { it.first() }
    .reduce { _, acc, el -> if (acc.length >= el.length) acc else el }
    .let(::println)