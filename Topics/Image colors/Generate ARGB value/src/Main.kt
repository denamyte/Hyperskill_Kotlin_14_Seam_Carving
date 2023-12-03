import java.awt.Color

fun printARGB() {
    readln().split(" ").map(String::toInt)
        .run {
            println(
                if (this.any { (it < 0 || it > 255) }) {
                    "Invalid input"
                } else {
                    val (a, r, g, b) = this
                    val color = Color(r, g, b, a)
                    color.rgb.toUInt()
                }
            )
        }
}
