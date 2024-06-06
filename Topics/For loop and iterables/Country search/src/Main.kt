// AI instructions:
//    You have a map
//    val map = mapOf("NG" to "Nigeria", "AU" to "Australia", "CA" to "Canada", "BG" to "Bulgaria", "DE" to "Germany").
//    Read a code from std (readln) and search for a country by the code using iterator, then print the result.
//    The code may be in lowercase.

fun main() {
    val map = mapOf("NG" to "Nigeria", "AU" to "Australia", "CA" to "Canada", "BG" to "Bulgaria", "DE" to "Germany")
    val code = readLine()!!.toUpperCase()
    val iterator = map.iterator()

    while (iterator.hasNext()) {
        val entry = iterator.next()
        if (entry.key == code) {
            println(entry.value)
            break
        }
    }
}