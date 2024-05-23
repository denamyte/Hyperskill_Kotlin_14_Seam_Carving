fun main() {
    val originalList = readln().split(" ")
    val originalSet = originalList.toSet()
    val word = readln()

    println(dropElements(originalList, word))
    println(dropElements(originalSet, word))
}

fun <T> dropElements(c: Collection<T>, el: T) = c.filter { it != el }