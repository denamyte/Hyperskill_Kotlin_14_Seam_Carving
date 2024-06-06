// You can experiment here, it won’t be checked

fun main() {
    val words = listOf("anne", "michael", "caroline", "dimitry", "emilio")
    println(words.maxByOrNull { it.length > 5 }) // michael

    println(words.minOfWith(naturalOrder()) { it.length }) // 8
}
