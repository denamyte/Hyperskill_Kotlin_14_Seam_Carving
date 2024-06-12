fun main() = readln().split(" ")
    .filter { Regex("^a.*a$").matches(it) }
    .let(::println)