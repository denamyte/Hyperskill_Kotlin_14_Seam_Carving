//    Read a list of numbers.
//    Calculate the sum of the first and last elements.
//    Print it.
//    Do not create variables, use chain of scope functions.
fun main() {
    readLine()!!.split(" ")
        .map { it.toInt() }
        .let { it.first() + it.last() }
        .let { println(it) }
}