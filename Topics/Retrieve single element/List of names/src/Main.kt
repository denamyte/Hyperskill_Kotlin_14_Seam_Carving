//    Read a list of words. It's guaranteed.
//    Select first word which starts with "j" and ends with "e".
//    Print it.
fun main() {
    val words = readLine()!!.split(" ")
    val selectedWord = words.firstOrNull { it.startsWith("j") && it.endsWith("e") }
    println(selectedWord)
}