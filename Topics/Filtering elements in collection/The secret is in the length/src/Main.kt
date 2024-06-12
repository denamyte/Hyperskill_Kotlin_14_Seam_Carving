fun main() = readln().split(" ")
    .drop(1)
    .filter { it.length == 5 }
    .let(::println)