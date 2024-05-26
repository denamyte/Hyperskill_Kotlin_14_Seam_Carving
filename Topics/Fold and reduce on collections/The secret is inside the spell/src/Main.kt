// AI instructions:
//    Read a list of words separated with space, from std.
//    At least one word exists.
//    Use "runningFold" functions to find the list
//    of intermediate values summing lengths of the words.

fun main() {
    val input = readLine() ?: ""
    val words = input.split(" ")
    val intermediateValues = words.runningFold(0) { acc, word -> acc + word.length }
    println(intermediateValues)
}