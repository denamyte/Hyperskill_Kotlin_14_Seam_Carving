fun main() =
    readln().split(" ")
        .map { it.split("-")[1].toInt() }
        .run {
            "${distinct().size}" +
                ":${sum()}" +
                ":${average()}"
        }.let(::println)