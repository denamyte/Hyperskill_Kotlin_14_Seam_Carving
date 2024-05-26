// AI instructions:
//    Read a list of words separated by space, from std.
//    At least one word is guaranteed.
//    Use fold to find the sum of lengths of words gte 4.

fun main() {
    val words = readLine()!!.split(" ")
    val sum = words.fold(0) { acc, word ->
        if (word.length >= 4) acc + word.length else acc
    }
    println(sum)
}