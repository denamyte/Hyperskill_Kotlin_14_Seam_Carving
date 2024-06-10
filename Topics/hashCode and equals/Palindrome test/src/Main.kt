fun isPalindrome(text: String): Boolean {
    val middle = text.length / 2
    return text.take(middle) == text.takeLast(middle).reversed()
}