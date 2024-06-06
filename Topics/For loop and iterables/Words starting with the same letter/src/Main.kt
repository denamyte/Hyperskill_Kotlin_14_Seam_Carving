fun main() =
    readln().split(" ")
        .run {
            val letter = get(0)[0]
            if (!any { !it.startsWith(letter) })
                println(joinToString(" "))
        }