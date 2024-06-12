fun main() = readln().split(" ")
    .groupingBy { it.first() }
    .fold(0) { acc, el -> acc + el.length }
    .let(::println)