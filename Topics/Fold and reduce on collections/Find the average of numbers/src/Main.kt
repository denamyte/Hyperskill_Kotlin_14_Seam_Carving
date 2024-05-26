// AI instructions:
//    Read a list of doubles from std, separated with a space.
//    Calculate the average and print the result.
//    The input is guaranteed.
//    Don't create variables, use a chain of calls.

fun main() {
    val average = readLine()!!.split(" ").map { it.toDouble() }.average()
    println(average)
}