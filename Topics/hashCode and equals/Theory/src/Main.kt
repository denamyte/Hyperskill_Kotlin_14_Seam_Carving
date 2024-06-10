// You can experiment here, it won’t be checked

fun main() {
    val words = listOf("anne", "michael", "caroline", "dimitry", "emilio")
    println(words.sortedBy { it.last() }.reversed())
}