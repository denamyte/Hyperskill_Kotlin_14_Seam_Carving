// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    val c1: Iterable<String> = listOf(" ")
    println(c1 is Collection<String>)
    val mi: MutableIterable<String> = mutableListOf(" ")
    println(mi is Collection<*>)

}
