// AI instructions:
//    Read a list of words from std, separated with a space.
//    Count on the list existence.
//    Print the sum of lengths of the words in even positions.
//    Do not create variables.

fun main() {
    val words = readLine()!!.split(" ")
    println(words.filterIndexed { index, _ -> index % 2 == 0 }.sumBy { it.length })
}