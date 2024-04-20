// Do NOT modify the following function
fun factorial(n: Int): BigInteger {
    return when (n) {
        0 -> BigInteger.ONE
        else -> BigInteger.valueOf(n.toLong()) * factorial(n - 1)
    }
}