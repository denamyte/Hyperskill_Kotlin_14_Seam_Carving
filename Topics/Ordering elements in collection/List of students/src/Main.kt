//    Read a list of words, sort it and print the resulting object.
//    Don't create variables
fun main() {
    readLine()?.split(" ")?.sorted()?.let(::println)
}