// AI instructions
//    Read from std a list in the format: <String>-<Number>, separated with a space.
//    At list one element is guaranteed.
//    Calculate the sum of the number parts where the string part
//        starts with "T" and the number part is gt 20.
//    Do not create variables.

fun main() {
    val input = readLine()!!.split(" ")
    val sum = input.filter { it.startsWith("T") && it.substringAfter("-").toInt() > 20 }
        .sumBy { it.substringAfter("-").toInt() }
    println(sum)
}