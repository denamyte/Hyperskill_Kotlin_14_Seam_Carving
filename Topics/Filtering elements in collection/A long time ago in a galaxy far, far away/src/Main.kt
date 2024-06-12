fun main() = readln().split(" ")
    .partition { it.contains("-jedi-") }
    .run { println("jedis: ${first.size}, siths: ${second.size}") }