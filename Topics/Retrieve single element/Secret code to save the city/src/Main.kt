//    Read a list of words.
//    Reverse every word in the list.
//    Select the first one starting from "m".
//    Print it.
//    Do not create variables; use chain of functions.
fun main() {
    readLine()?.split(" ")?.map { it.reversed() }?.firstOrNull { it.startsWith("m") }?.let { println(it) }
}