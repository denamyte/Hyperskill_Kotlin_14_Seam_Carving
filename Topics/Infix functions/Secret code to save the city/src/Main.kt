//    Dear AI.
//    Create an infix fun named secret on a list of strings.
//    The fun must accept a parameter limit and return
//    the sum of all lengths of the list items which length is gt limit.

infix fun List<String>.secret(limit: Int): Int =
    this.filter { it.length > limit }.sumBy { it.length }

// Since the language model operates on an old version of Kotlin: sumBy -> sumOf
