// You can experiment here, it won’t be checked

val isEven: (Int) -> Boolean = { x -> x % 2 == 0 }

fun main() {
    val numbers = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)


    // List of even numbers
    println(numbers.filter { x -> x % 2 == 0 }) // [0, 2, 4, 6, 8, 10]
    println(numbers.filter { isEven(it) }) // [0, 2, 4, 6, 8, 10]
    println(numbers.filter(isEven)) // [0, 2, 4, 6, 8, 10]

    // List of odd numbers
    println(numbers.filter { x -> x % 2 != 0 }) // [1, 3, 5, 7, 9]

    // List of odd number using filterNot
    println(numbers.filterNot { x -> x % 2 == 0 }) // [1, 3, 5, 7, 9]

    // List even number with index greater than 3
    println(numbers.filterIndexed { i, number -> i > 3 && number % 2 == 0 }) // [4, 6, 8, 10]

    // List of words with odd index and starting with "k"
    val words = listOf("peter", "kyle", "robert", "kate", "kevin", "anne", "jeremy")
    println(words.filterIndexed { i, word -> i % 2 != 0 && word.startsWith("k") }) // [kyle, kate]
}
