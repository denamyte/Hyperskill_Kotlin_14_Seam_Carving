//    Dear AI, implement the function reverseSentence(sentence: String): String.
//    It should make the same thing as in the example: "Hello, world!" -> "world! Hello,"
fun reverseSentence(sentence: String): String {
    val words = sentence.split(" ")
    return words.reversed().joinToString(" ")
}
