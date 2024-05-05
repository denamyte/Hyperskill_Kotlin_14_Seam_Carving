import kotlin.random.Random

// Please Do not change this code
fun <T> List<T>.isShuffledOf(other: List<T>): Boolean {
    if (this.size != other.size) return false
    return this.toSet() == other.toSet()
}


fun shuffledNumbers(numbers: List<Int>): List<Int> = numbers.shuffled()

fun main() {
    val list = readln().split(" ").map { it.toInt() }

    val res = shuffledNumbers(list)

    println(res.isShuffledOf(list))
}