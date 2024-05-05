//    Read a list of integers.
//    Sort it in the reverse order.
//    Print the whole object, not each element, stupid one!
//    Don't create variables.
fun main() {
    readLine()!!.split(" ").map { it.toInt() }.sortedDescending().also(::println)
}