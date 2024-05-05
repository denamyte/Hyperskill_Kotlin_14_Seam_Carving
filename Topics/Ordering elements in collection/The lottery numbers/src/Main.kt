// Read a list of numbers separated with a space assuming the list exists,
// sort it and print the whole list.
fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val sortedList = input.sorted()
    println(sortedList)
}