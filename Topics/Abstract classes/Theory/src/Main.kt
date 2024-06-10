// You can experiment here, it won’t be checked

fun main() {
    val list = listOf(0, 2, 0, 4, 7)

    val num = list.firstOrNull { it < 10 }
    println(num)
}
