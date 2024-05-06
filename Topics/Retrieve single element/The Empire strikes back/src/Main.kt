//    Read a string from std which consists of names separated by space.
//    Each name is in the format "string-number".
//    Filter names which number part is greater than 200.
//    If there is no such names print "No ship found". Otherwise, print the string part of the last name. Use compact code.
fun main() {
    val input = readLine()
    val names = input?.split(" ") ?: emptyList()
    val filteredNames = names.filter { it.split("-")[1].toInt() > 200 }
    if (filteredNames.isEmpty()) {
        println("No ship found")
    } else {
        println(filteredNames.last().split("-")[0])
    }
}