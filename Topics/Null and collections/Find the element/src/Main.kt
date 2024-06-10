fun main() {
    val set = setOf(12, 34, 235, 2343, 1, 3, 4564, 23, 5, 6, 123545, 464)
    val cmd = readln()
    val num = readln().toInt()

    println(
        when (cmd) {
            "first" -> set.firstOrNull { it > num }
            else -> set.lastOrNull { it > num }
        }
    )
}