fun main() = readln().split(' ')
    .filter { it.first() in 'a'..'l' }
    .minByOrNull { it.length }
    .let(::println)