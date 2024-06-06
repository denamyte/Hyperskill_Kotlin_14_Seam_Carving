// AI instructions:
//    Implement fun findLongestByIterator which accepts
//    a String iterator and chooses the longest word from it.
//    Check the method in main: read a string of words separated
//    by space and call the method. The input string is mandatory.

fun findLongestByIterator(iterator: Iterator<String>): String {
    var longestWord = ""
    while (iterator.hasNext()) {
        val word = iterator.next()
        if (word.length > longestWord.length) {
            longestWord = word
        }
    }
    return longestWord
}

fun main() {
    val input = readLine() ?: throw IllegalArgumentException("Input string is mandatory")
    val words = input.split(" ")
    val longestWord = findLongestByIterator(words.iterator())
    println(longestWord)
}