fun main() {
    fun isPal(s: String) = s == s.reversed()
    readln().split(" ").asSequence()
        .filter(::isPal).count()
        .let(::println)
}