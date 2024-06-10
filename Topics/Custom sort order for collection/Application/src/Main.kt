data class Ship(val name: String, val ammunition: Int)

fun main() =
    readln().split(" ")
        .map { it.split("-") }
        .map { Ship(it[0], it[1].toInt()) }
        .sortedBy { it.ammunition }
        .let(::println)