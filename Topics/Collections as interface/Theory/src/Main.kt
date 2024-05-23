// You can experiment here, it won’t be checked

fun main() {
    val iter: Iterable<String> = listOf("str")

    println(iter.associate { it to it })
}
