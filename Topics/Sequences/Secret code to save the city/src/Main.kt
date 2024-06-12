fun main() = readln().split(" ").asSequence()
    .filter { it.length > 5 }
    .take(3)
    .map(String::reversed)
    .map(String::uppercase)
    .toList()
    .let(::println)