// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    val names = listOf("anne", "michael", "caroline", "dimitry", "emilio")
    println(names.count { it.length > 6 })

    names.maxByOrNull { it.length }.let(::println)
}
