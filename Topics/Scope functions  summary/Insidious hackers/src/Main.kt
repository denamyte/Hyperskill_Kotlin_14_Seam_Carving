fun main() {
    readln()
        .removePrefix("he-he-he")
        .plus(" with great actor Ryan Gosling")
        .uppercase()
        .let(::println)
}
