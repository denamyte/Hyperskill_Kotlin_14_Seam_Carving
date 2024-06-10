fun main() = readln().split(" ")
    .sortedDescending()
    // But should be, according to the task description:
    //        .sortedWith(compareByDescending { it.first() })
    .let(::println)