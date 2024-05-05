// Read a list of words from standard input.
// Check if this list is a palindrome one and print the boolean result.
// Don't create variables if possible.
fun main() {
    val words = readLine()?.split(" ")
    println(words == words?.reversed())
}