// You can experiment here, it won’t be checked

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // joinToString
    val joinToString = numbers.joinToString(
        separator = " ; ",
        prefix = "{ ",
        postfix = " }",
        limit = 3,
        truncated = "..."
    )
    println(joinToString) // { 1 ; 2 ; 3; ... }

    // joinTo appendable
    val joinTo = numbers.joinTo(
        StringBuilder(),
        separator = " ; ",
        prefix = "{ ",
        postfix = " }",
        limit = 3,
        truncated = "..."
    )
    println(joinTo) // {1 ; 2 ; 3...}

}
