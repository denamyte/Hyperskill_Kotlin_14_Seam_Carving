package seamcarving

fun main() {
    val width = inputInt("Enter rectangle width:")
    val height = inputInt("Enter rectangle height:")
    println("Enter output image name:")
    val fileName = readln()

    Stage1(width, height, fileName).run()
}

private fun inputInt(msg: String): Int {
    println(msg)
    return readln().toInt()
}