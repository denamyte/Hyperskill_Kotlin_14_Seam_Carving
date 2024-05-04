fun main() {
    readln()
        .let {
            if (it.length > 15)
                "Our long song: $it".uppercase()
            else "Our short song: $it".lowercase()
        }.let(::println)
}