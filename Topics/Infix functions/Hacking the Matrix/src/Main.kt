// complete the definition
infix fun List<Int>.matrix(code: Int): Int =
    filter { it % code == 0 }.sum()

