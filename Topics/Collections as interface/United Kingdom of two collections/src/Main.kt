fun main() {
    val oldList = readln().split(" ").toMutableList()
    val oldSet = oldList.toMutableSet()
    val addedList = readln().split(" ").toList()

    addListToCollection(oldList, addedList)
    addListToCollection(oldSet, addedList)

    println(oldList.joinToString(" "))
    println(oldSet.joinToString(" "))
}

fun <T> addListToCollection(c1: MutableCollection<T>, c2: Collection<T>) {
    c1 += c2
}